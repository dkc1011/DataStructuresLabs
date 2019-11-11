package Graphs;

import java.util.Deque;
import java.util.LinkedList;

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        if(matrix[source][dest] == 1.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void insert(Edge edge) {
        int source = edge.getSource();
        int destination = edge.getDestination();
        matrix[source][destination] = 1.0f;

        if(isDirected()) {
            matrix[destination][source] = 1.0f;
        }
    }

    public void remove(Edge edge) {
        int source = edge.getSource();
        int destination = edge.getDestination();
        matrix[source][destination] = 0.0f;

        if(isDirected()) {
            matrix[destination][source] = 0.0f;
        }
    }

    private enum State {
        VISITED, NOT_VISITED, WAITING
    }
    
    public void breadthFirstTraversal(int start){
        Deque<Integer> queue = new LinkedList<>();
        State[] vertices = new State[getNumVertices()];


        for(int i = 0; i < vertices.length; i++)
        {
            vertices[i] = State.NOT_VISITED;
        }

        queue.add(start);

        while(!queue.isEmpty())
        {
            int vertex = queue.removeFirst();
            System.out.println(vertex);
            vertices[vertex] = State.VISITED;

            

        }
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}
