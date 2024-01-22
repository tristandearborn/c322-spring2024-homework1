package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void prefix() {
        String[] arr1 = {"flower", "flow", "flight"};
        assertEquals("fl", Problem3.prefix(arr1));

        String[] arr2 = {"dog", "racecar", "car"};
        assertEquals("", Problem3.prefix(arr2));
    }
}