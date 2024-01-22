package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void addToTarget() {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = Problem1.addToTarget(nums1, target1);
        assertArrayEquals(new int[]{0, 1}, result1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = Problem1.addToTarget(nums2, target2);
        assertArrayEquals(new int[]{1, 2}, result2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = Problem1.addToTarget(nums3, target3);
        assertArrayEquals(new int[]{0, 1}, result3);
    }
}