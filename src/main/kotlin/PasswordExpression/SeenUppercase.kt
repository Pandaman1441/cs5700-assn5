package PasswordExpression

class SeenUppercase : PasswordState{
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        when (char) {
            in  "~!@#$%^&*()_+|}{:?><.,;][=-" -> passwordVerifier.state = Gate()
                "" -> passwordVerifier.state = InvalidPassword()
                " " -> passwordVerifier.state = InvalidPassword()
                else -> passwordVerifier.state = SeenUppercase()
        }
    }
}