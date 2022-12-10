package queue;
import java.util.NoSuchElementException;
import java.util.Queue;

public class arrayQueue
{
    private Employeee[] Queue;
    private int front;
    private int back;

    public arrayQueue(int capacity)
    {
        Queue=new Employeee[capacity];
    }
    public add(Employeee Employeee)
    {
        if(back==Queue.length)
        {
            Employeee[] temp=new Employeee[2*Queue.length];
            System.arraycopy(Queue, 0, temp, 0, Queue.length);
            Queue=temp;
        }
        Queue[back++]=Employeee;
    }

    public Empployee remove()
    {
        if(size()==0)
        {
            throw new NoSuchElementException();
        }
        Employeee Employeee=Queue[front];
        Queue[front]=null;
        front++;
        if(size()==0)
        {
            front=0;
            back=0;
        }
        return Employeee;
    }
    public Employeee peek()
    {
        return Queue[front];
    }
    public void printQueue()
    {
        for(Employeee i:Queue)
        {
            System.out.println(i);
        }
    }
}