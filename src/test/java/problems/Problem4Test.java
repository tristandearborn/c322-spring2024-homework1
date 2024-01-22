package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void romanToInteger() {
        String roman1 = "III";
        assertEquals(3, Problem4.romanToInteger(roman1));

        String roman2 = "LVIII";
        assertEquals(58, Problem4.romanToInteger(roman2));

        String roman3 = "MCMXCIV";
        assertEquals(1994, Problem4.romanToInteger(roman3));
    }
}