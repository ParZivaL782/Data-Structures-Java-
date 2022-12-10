import java.util.LinkedList;

public class Node 
{
    private int id;
    LinkedList<Node> adjacent =new LinkedList<Node>();
    private Node(int id)
    {
        this.id=id;
    }    
}
 