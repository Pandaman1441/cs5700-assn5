package FloatingPointExpression

class LeadingInteger : FloatingState{
    override fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier) {
        when (char) {
            in  "0123456789" -> floatingVerifier.state = LeadingInteger()
                "." -> floatingVerifier.state = Point()
                else -> floatingVerifier.state = InvalidFloat()
        }

    }
}