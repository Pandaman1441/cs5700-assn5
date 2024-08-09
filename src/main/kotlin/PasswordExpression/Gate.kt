package PasswordExpression

class Gate : PasswordState{
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        when (char) {
            in  "" -> passwordVerifier.state = InvalidPassword()
                " " -> passwordVerifier.state = InvalidPassword()
                "~!@#$%^&*()_+|}{:?><.,;][=-" -> passwordVerifier.state = Gate()
                else -> passwordVerifier.state = ValidPassword()
        }
    }
}