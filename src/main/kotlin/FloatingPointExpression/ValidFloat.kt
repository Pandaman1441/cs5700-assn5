package FloatingPointExpression

class ValidFloat : FloatingState{
    override fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier) {
        if (char in "0123456789"){
            floatingVerifier.state = ValidFloat()
        }
        else {
            floatingVerifier.state = InvalidFloat()
        }
    }
}