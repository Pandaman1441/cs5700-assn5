package BinaryExpression


class LeadingOne : BinaryState {
    override fun consumeCharacter(char: String, binaryVerifier: BinaryVerifier) {
        if (char == "1"){
            binaryVerifier.state = ValidBinary()
        }
        else{
            binaryVerifier.state = InvalidBinary()
        }
    }
}