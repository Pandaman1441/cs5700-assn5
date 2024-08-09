package PasswordExpression

interface PasswordState {
    fun consumeCharacter(char: String, passwordVerifier: PasswordVerifier)
}