package part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problemsTest {

    @Test
    void addToTarget() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = problems.addToTarget(nums1, target1);
        assertArrayEquals(new int[]{0, 1}, result1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = problems.addToTarget(nums2, target2);
        assertArrayEquals(new int[]{1, 2}, result2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = problems.addToTarget(nums3, target3);
        assertArrayEquals(new int[]{0, 1}, result3);
    }

    @Test
    void palindrome() {
        int x1 = 121;
        assertTrue(problems.palindrome(x1));

        int x2 = -121;
        assertFalse(problems.palindrome(x2));

        int x3 = 10;
        assertFalse(problems.palindrome(x3));
    }

    @Test
    void prefix() {
        String[] arr1 = {"flower", "flow", "flight"};
        assertEquals("fl", problems.prefix(arr1));

        String[] arr2 = {"dog", "racecar", "car"};
        assertEquals("", problems.prefix(arr2));
    }

    @Test
    void romanToInteger() {
        String roman1 = "III";
        assertEquals(3, problems.romanToInteger(roman1));

        String roman2 = "LVIII";
        assertEquals(58, problems.romanToInteger(roman2));

        String roman3 = "MCMXCIV";
        assertEquals(1994, problems.romanToInteger(roman3));
    }

    @Test
    void isValid() {
        String s1 = "()";
        assertTrue(problems.isValid(s1));

        String s2 = "()[]{}";
        assertTrue(problems.isValid(s2));
    }

    @Test
    void increment() {
        int[] digits1 = {1, 2, 3};
        int[] result1 = problems.increment(digits1);
        assertArrayEquals(new int[]{1, 2, 4}, result1);

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = problems.increment(digits2);
        assertArrayEquals(new int[]{4, 3, 2, 2}, result2);

        int[] digits3 = {9};
        int[] result3 = problems.increment(digits3);
        assertArrayEquals(new int[]{1, 0}, result3);
    }
}