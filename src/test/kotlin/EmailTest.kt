import EmailExpression.EmailVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EmailTest {

    @Test
    fun testValidEmail() {
        val verifier = EmailVerifier()

        assertTrue(verifier.verify("a@b.C"))
        assertTrue(verifier.verify("Pandaman1441@outlook.com"))
        assertTrue(verifier.verify("Tonio.Beja@class.edu"))
        assertTrue(verifier.verify("{}*$.&$*(@*$%&.*&*"))

    }

    @Test
    fun testInvalidEmail() {
        val verifier = EmailVerifier()

        assertFalse(verifier.verify("@b.c"))
        assertFalse(verifier.verify("a@b@c.com"))
        assertFalse(verifier.verify("a.b@b.b.c"))
        assertFalse(verifier.verify("Tonio Beja@class.edu"))
        assertFalse(verifier.verify("pandaman1441@ou look.com"))
        assertFalse(verifier.verify("a@.c"))
        assertFalse(verifier.verify("a@b."))

    }
}