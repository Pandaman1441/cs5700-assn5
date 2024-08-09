import BinaryExpression.BinaryVerifier
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryTest {

    @Test
    fun testValidBinary() {
        val verifier = BinaryVerifier()

        assertTrue(verifier.verify("1"))
        assertTrue(verifier.verify("11"))
        assertTrue(verifier.verify("101"))
        assertTrue(verifier.verify("111111"))
        assertTrue(verifier.verify("1001001011101"))
    }

    @Test
    fun testInvalidBinary(){
        val verifier = BinaryVerifier()

        assertFalse(verifier.verify("01"))
        assertFalse(verifier.verify("10"))
        assertFalse(verifier.verify("10000010"))
        assertFalse(verifier.verify("1010a101"))
    }
}