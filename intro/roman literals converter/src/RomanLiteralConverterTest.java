import static org.junit.Assert.*;

public class RomanLiteralConverterTest {
    RomanLiteralConverter rc = new RomanLiteralConverter();
    @org.junit.Test
    public void integerToRoman() {
        assertEquals("LV",rc.integerToRoman(55));
    }

    @org.junit.Test
    public void romanToInteger() {
        assertEquals(1997,rc.romanToInteger("mcmxcvii"));
    }

    @org.junit.Test
    public void addition() {
        assertEquals("XIII",rc.addition("v","viii"));
    }

    @org.junit.Test
    public void subtraction() {
        assertEquals("V",rc.subtraction("xiii","viii"));
    }

    @org.junit.Test
    public void multiplication() {
        assertEquals("XX",rc.multiplication("v","iv"));
    }

    @org.junit.Test
    public void division() {
        assertEquals("VII",rc.division("xxi","iii"));
    }
}