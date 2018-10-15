import org.junit.Test;

import static org.junit.Assert.*;

public class ABCTestTest {

    @Test
    public void abcTest1() {
        boolean result = ABCTest.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = ABCTest.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = ABCTest.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTestBlank() {
        boolean result = ABCTest.abcTest("");
        assertEquals(false, result);
    }

    @Test
    public void alternatingTest1() {
        String result = ABCTest.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternatingTest2() {
        String result = ABCTest.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternatingTest3() {
        String result = ABCTest.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternatingTest4() {
        String result = ABCTest.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternatingTestBlank() {
        String result = ABCTest.alternateStrings("", "");
        assertEquals("", result);
    }
}