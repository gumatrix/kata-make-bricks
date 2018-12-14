package kata.makebricks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MakeBricksUTest {

    @Test
    void makeBricks() {
        assertFalse(makeBricks(0, 0, 1));
        assertTrue(makeBricks(1, 0, 1));
        assertTrue(makeBricks(1, 1, 1));
        assertTrue(makeBricks(0, 2, 5));
        assertFalse(makeBricks(1, 0, 2));
        assertTrue(makeBricks(1, 1, 6));
        assertTrue(makeBricks(4, 1, 4));
        assertTrue(makeBricks(1, 1, 5));
        assertTrue(makeBricks(0, 3, 10));
        assertTrue(makeBricks(2, 0, 1));
        assertFalse(makeBricks(2, 1000000, 100003));
    }

    Boolean makeBricks(int small, int big, double goal) {
        return null;
    }
}