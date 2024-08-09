import FloatingPointExpression.FloatingVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FloatingPointTest {

    @Test
    fun testValidFloating() {
        val verifier = FloatingVerifier()
        assertTrue(verifier.verify("1.0"))
        assertTrue(verifier.verify("3.14"))
        assertTrue(verifier.verify("0.2000"))
        assertTrue(verifier.verify(".605"))
        assertTrue(verifier.verify("12385931912983.4919238592884"))
    }

    @Test
    fun testInvalidFloating() {
        val verifier = FloatingVerifier()
        assertFalse(verifier.verify(""))
        assertFalse(verifier.verify("123"))
        assertFalse(verifier.verify("23.13."))
        assertFalse(verifier.verify("123.12a"))
        assertFalse(verifier.verify("123."))
        assertFalse(verifier.verify("12a.12"))
        assertFalse(verifier.verify("0123.1"))
        assertFalse(verifier.verify("."))
        assertFalse(verifier.verify(".a"))
        assertFalse(verifier.verify("a"))
    }
}