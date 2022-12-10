package Queue;

public class ArrayQueue 
{
    private Employee[] Queue;
    private int front;
    private int last;

    public ArrayQueue(int capacity)
    {
        Queue=new Employee[capacity];
    }

     public add(Employee employee)
     {
         if(last==Queue.length)
         {
             Employee[] newArray=new Employee[2*Queue.length];


         }
     }
}
