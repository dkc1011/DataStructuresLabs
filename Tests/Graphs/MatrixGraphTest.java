package Graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph graph;

    @BeforeEach
    void setup()
    {
        graph = new MatrixGraph(5, true);


    }

    @Test
    void isEdge() {
        Edge edge = new Edge(0, 1);
        graph.insert(edge);

        boolean actual = graph.isEdge(0, 1);

        assertTrue(actual);

        graph.remove(edge);

        actual = graph.isEdge(0,1);

        assertFalse(actual);
    }

    @Test
    void insert() {
        Edge edge = new Edge(0, 1);
        graph.insert(edge);

        boolean actual = graph.isEdge(0,1);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        Edge edge = new Edge(0, 1);
        graph.insert(edge);

        boolean actual = graph.isEdge(0, 1);

        assertTrue(actual);

        graph.remove(edge);

        actual = graph.isEdge(0,1);

        assertFalse(actual);
    }

    @Test
    void breadthFirstTraversal() {
    }

    @Test
    void depthFirstTraversal() {
    }
}