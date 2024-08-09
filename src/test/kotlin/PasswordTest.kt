import PasswordExpression.PasswordVerifier
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PasswordTest {

    @Test
    fun testValidPassword() {
        val verifier = PasswordVerifier()

        //assertTrue(verifier.verify("okayH!aa"))
        assertTrue(verifier.verify("1*23456789J"))
        assertTrue(verifier.verify("asdpoijf:fjiweonvaoi:ijeijf*2039jad:keij20ji@aI"))
    }

    @Test
    fun testInvalidPassword() {
        val verifier = PasswordVerifier()

        assertFalse(verifier.verify("a"))
        assertFalse(verifier.verify("aaaaaa!"))
        assertFalse(verifier.verify("aaaHaaaaa"))
        assertFalse(verifier.verify("Abbbbbb!"))
    }
}