package FloatingPointExpression

class LeadingZero : FloatingState{
    override fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier) {
        if (char == "."){
            floatingVerifier.state = Point()
        }
        else{
            floatingVerifier.state = InvalidFloat()
        }

    }
}