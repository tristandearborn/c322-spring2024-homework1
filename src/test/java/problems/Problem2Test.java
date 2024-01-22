package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void palindrome() {
        int x1 = 121;
        assertTrue(Problem2.palindrome(x1));

        int x2 = -121;
        assertFalse(Problem2.palindrome(x2));

        int x3 = 10;
        assertFalse(Problem2.palindrome(x3));
    }
}