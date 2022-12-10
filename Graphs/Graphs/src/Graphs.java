import java.io.*;
import java.util.*;


public class Graphs 
{
private int V;
private LinkedList<Integer> adj[];

Graphs(int v)
{
    this.V=v;
    adj = new LinkedList[v];
    for(int i=0;i<v;++i)
    {
        adj[i]=new LinkedList();
    }
}
void addEdge(int v,int w)
{
    adj[v].add(w);
}

void BFS(int s)
{
    boolean visited[]=new boolean[V];
    LinkedList<Integer> quene = new LinkedList<Integer>();
    visited[s]=true;
    quene.add(s);

    while(quene.size() !=0)
    {
        s = quene.poll();
        System.out.print(s+" ");
        Iterator<Integer> i=adj[s].listIterator();
        while(i.hasNext())
        {
            int n=i.next();
            if(!visited[n])
            {
                visited[n]=true;
                quene.add(n);
            }
        }
    }
}
public static void main(String[] args) 
    {
        Graphs g=new Graphs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
    }
}
