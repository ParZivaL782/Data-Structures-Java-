package list;

public class EmployeeDoublylinkedlist 
{
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee)
    {
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        if(head==null)
        {
            tail=node;
        }
        else
        {
            head.setPrevious(node);
        }

        head=node;
        size++;
    }    
    public void addtoEnd(Employee employee)
    {
    EmployeeNode node=new EmployeeNode(employee);
    if(tail==null)
    {
        head=node;
    }
    else
    {
        tail.setNext(node);
        node.setPrevious(tail);
    }
    tail=node;

    }


    public boolean addBefore(Employee employee,Employee employee1) throws Exception
    {
        if(head==null)
        {
           return false;
        }

        EmployeeNode current = head;
        EmployeeNode newNode = new EmployeeNode(employee);
        while(current!=null && !current.getEmployee().equals(employee1))
        {
            current=current.getNext();
        }
        if(current==null)
        {
            return false;
        }

        newNode.setPrevious(current.getPrevious());
        current.setPrevious(newNode);
        newNode.setNext(current);

        if(current==head)
        {
            head=newNode;
        }
        else
        {
            newNode.getPrevious().setNext(newNode);
        }   
        size++;
        return false;

    }

    public boolean contain(Employee employee)
    {
        EmployeeNode current=head;
        EmployeeNode check=new EmployeeNode(employee);
        while(current!=null)
        {
            if(current==check)
            {
                return true;
            }
            current=current.getNext();
        }
        return false;
    }

    public int getSize()
    {
        return size;
    }

    public EmployeeNode removeHead()
    {
        if(isEmpty())
        {
            return null;
        }
        EmployeeNode removedEmployee= head;

        if(head.getNext()==null)
        {
            tail=null;
        }
        else
        {
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        return removedEmployee;
    }

    public EmployeeNode removetail()
    {
        if(isEmpty())
        {
            return null;
        }
        EmployeeNode removednode=tail;

        if(tail.getPrevious()==null)
        {
            head=null;
        }
        else
        {
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        return removednode;
    }

    public void printList()
    {
        EmployeeNode qurrent=head;
        System.out.print("HEAD->");
        while(qurrent!=null)
        {
            System.out.print(qurrent);
            System.out.print(" <=> ");
            qurrent = qurrent.getNext();
        }
        System.out.println("NUll");

    }

    public boolean isEmpty()
    {
        return head==null;
    }

}
