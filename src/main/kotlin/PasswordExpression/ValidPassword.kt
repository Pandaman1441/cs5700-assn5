package PasswordExpression

class ValidPassword : PasswordState{
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        when (char) {
            in "" -> passwordVerifier.state = InvalidPassword()
                " " -> passwordVerifier.state = InvalidPassword()
            in  "~!@#$%^&*()_+|}{:?><.,;][=-" -> passwordVerifier.state = Gate()
                else -> passwordVerifier.state = ValidPassword()
        }
    }
}