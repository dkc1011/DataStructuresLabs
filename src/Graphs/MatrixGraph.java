package Graphs;

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
        else
        {
            return  false;
        }
        //complete this method
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
    
    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}
