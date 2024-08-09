package FloatingPointExpression

class Start : FloatingState{
    override fun consumeCharacter(char: String, floatingVerifier: FloatingVerifier) {
        when (char) {
            in  "123456789" -> floatingVerifier.state = LeadingInteger()
                "0" -> floatingVerifier.state = LeadingZero()
                "." -> floatingVerifier.state = Point()
                else -> floatingVerifier.state = InvalidFloat()
        }
    }
}