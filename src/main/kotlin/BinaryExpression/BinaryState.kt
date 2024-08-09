package BinaryExpression

interface BinaryState {
    fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier)
}