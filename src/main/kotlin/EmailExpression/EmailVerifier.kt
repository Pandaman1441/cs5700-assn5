package EmailExpression

class EmailVerifier {
    lateinit var state: EmailState

    fun verify(string: String): Boolean {
        state =
            string.chunked(1).forEach {
                state.consumeCharacter(it, this)
            }
        return state is ValidEmail
    }
}