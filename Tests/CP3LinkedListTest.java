import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        myList.addFirst("William");
    }

    @Test
    void getFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        Assertions.assertThrows(NoSuchElementException.class,() -> {
            myList.getFirst();
        });

        myList.addFirst("Ted");

        String actual = myList.getFirst();
        String expected = "Ted";

        assertEquals(expected, actual);

    }

    @Test
    void removeFirst() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        Assertions.assertThrows(NoSuchElementException.class,() -> {
            myList.getFirst();
        });

        myList.addFirst("Ted");


    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        boolean actual = myList.isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);

        myList.addFirst("Jim");
        myList.addFirst("Sal");
        myList.addFirst("Ted");

        actual = myList.isEmpty();
        expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void print() {


    }

    @Test
    void size() {
        CP3LinkedList<String> myList = new CP3LinkedList();

        int expectedSize;
        int actualSize;

        expectedSize = 0;
        actualSize = myList.size();

        assertEquals(expectedSize, actualSize);

        myList.addFirst("William");
        myList.addFirst("Ted");
        myList.addFirst("Mary");

        expectedSize = 3;
        actualSize = myList.size();

        assertEquals(expectedSize, actualSize);

    }

    @Test
    void addLast() {
        CP3LinkedList<String> myList = new CP3LinkedList();


    }
}