package EmailExpression

class ValidEmail : EmailState {
    override fun consumeCharacter(char: String, emailVerifier: EmailVerifier) {
        when (char){
            in  "" -> emailVerifier.state = InvalidEmail()
                " " -> emailVerifier.state = InvalidEmail()
                "@" -> emailVerifier.state = InvalidEmail()
                "." -> emailVerifier.state = InvalidEmail()
                else -> emailVerifier.state = ValidEmail()
        }
    }
}