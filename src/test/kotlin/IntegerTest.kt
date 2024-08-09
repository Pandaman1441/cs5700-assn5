import IntegerExpression.IntegerVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IntegerTest {

    @Test
    fun testValidInteger() {
        val verifier = IntegerVerifier()
        assertTrue(verifier.verify("1"))
        assertTrue(verifier.verify("123"))
        assertTrue(verifier.verify("65985193482747823234"))
        assertTrue(verifier.verify("14"))
    }

    @Test
    fun testInvalidInteger() {
        val verifier = IntegerVerifier()
        assertFalse(verifier.verify(""))
        assertFalse(verifier.verify("0123"))
        assertFalse(verifier.verify("123a"))
        assertFalse(verifier.verify("0"))
    }
}