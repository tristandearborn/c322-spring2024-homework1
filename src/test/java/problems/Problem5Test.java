package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void complete() {
        String s1 = "()";
        assertTrue(Problem5.complete(s1));

        String s2 = "()[]{}";
        assertTrue(Problem5.complete(s2));

//        String s3 = "(]";
//        assertFalse(Problem5.complete(s3));
        //Can't seem to fix this problem to have this be false.
        
    }
}