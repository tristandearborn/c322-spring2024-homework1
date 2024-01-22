package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void increment() {
        int[] digits1 = {1, 2, 3};
        int[] result1 = Problem7.increment(digits1);
        assertArrayEquals(new int[]{1, 2, 4}, result1);

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = Problem7.increment(digits2);
        assertArrayEquals(new int[]{4, 3, 2, 2}, result2);

        int[] digits3 = {9};
        int[] result3 = Problem7.increment(digits3);
        assertArrayEquals(new int[]{1, 0}, result3);
    }
}