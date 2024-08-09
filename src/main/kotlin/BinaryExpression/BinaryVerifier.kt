package BinaryExpression

class BinaryVerifier {
    lateinit var state: BinaryState

    fun verify(string: String): Boolean {
        state = LeadingOne()
            string.chunked(1).forEach {
                state.consumeCharacter(it, this)
            }
        return state is ValidBinary
    }
}