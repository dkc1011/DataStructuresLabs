package Lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveDriverTest {

    @Test
    void findSmallest() {
        int[] array = {13, 4, 54, 67, 8, 110};
        int expected = RecursiveDriver.findSmallest(array);
        int actual = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findSmallest2() {
        int[] array = {13, 4, 54, 67, 8, -110};
        int expected = RecursiveDriver.findSmallest(array);
        int actual = -110;

        assertEquals(expected, actual);
    }


    @Test
    void findSmallest3() {
        int[] array = {13, 4, 54, 67, 8, -110};
        int expected = RecursiveDriver.findSmallest(array);
        int actual = -10;

        assertNotEquals(expected, actual);
    }
}