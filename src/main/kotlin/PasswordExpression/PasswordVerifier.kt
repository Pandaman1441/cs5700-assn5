package PasswordExpression

class PasswordVerifier {
    lateinit var state: PasswordState

    fun verify(string: String): Boolean {
        if (string.length < 8) return false

        state = Initial()
            string.chunked(1).forEach {
                state.consumeCharacter(it, this)
            }
        return state is ValidPassword
    }
}