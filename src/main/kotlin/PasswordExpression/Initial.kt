package PasswordExpression

class Initial : PasswordState{
    override fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier) {
        when (char){
            in  "A".."Z" -> passwordVerifier.state = SeenUppercase()
            in  "*~!@#$%^&()_+|}{:?><.,;][=-" -> passwordVerifier.state = SeenSpecial()
                "" -> passwordVerifier.state = InvalidPassword()
                " " -> passwordVerifier.state = InvalidPassword()
                else -> passwordVerifier.state = Initial()
        }
    }
}