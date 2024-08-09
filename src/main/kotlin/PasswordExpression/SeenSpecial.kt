package PasswordExpression

class SeenSpecial : PasswordState{
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        when (char) {
            in  "A".."Z" -> passwordVerifier.state = ValidPassword()
                "" -> passwordVerifier.state = InvalidPassword()
                " " -> passwordVerifier.state = InvalidPassword()
                else -> passwordVerifier.state = SeenSpecial()
        }
    }
}