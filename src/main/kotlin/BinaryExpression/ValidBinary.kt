package BinaryExpression


class ValidBinary : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        when (char){
            in  "0" -> binaryVerifier.state = Binary()
            "1" -> binaryVerifier.state = ValidBinary()
            else -> binaryVerifier.state = InvalidBinary()
        }
    }
}