package FloatingPointExpression

class Point : FloatingState{
    override fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier) {
        if (char in "0123456789"){
            floatingVerifier.state = ValidFloat()
        }
        else {
            floatingVerifier.state = InvalidFloat()
        }
    }
}