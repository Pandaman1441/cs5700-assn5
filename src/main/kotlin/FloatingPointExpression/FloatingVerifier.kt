package FloatingPointExpression


class FloatingVerifier {
    lateinit var state: FloatingState

    fun verify(string: String): Boolean {
        state = Start()
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is ValidFloat
    }
}