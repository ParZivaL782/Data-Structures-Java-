package academy.learnprogramming.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable 
{
    LinkedList<storedEmployee>[] hashtable;

    ChainedHashtable()
    {
        hashtable = new LinkedList[10];
        for(int i=0;i<hashtable.length;i++)
        {
            hashtable[i]=new LinkedList<storedEmployee>();
        }
    }

    public void put(String key,Employee employee)
    {
        int hashedKey=hashKey(key);
        hashtable[hashedKey].add(new storedEmployee(key, employee));
    }
   
    public Employee get(String key)
    {
        int hashedKey=hashKey(key);

        if(hashtable[hashedKey].isEmpty())
        {
            return null;
        }

        ListIterator<storedEmployee> iterator=hashtable[hashedKey].listIterator();
        storedEmployee st=null;
        while(iterator.hasNext())
        {
            st=iterator.next();
            if(st.key.equals(key))
            {
                return st.employee;
            }
        }
        return null;
    }

    public Employee remove(String key)
    {
        int hashedKey=hashKey(key);

        if(hashtable[hashedKey].isEmpty())
        {
            return null;
        }

        ListIterator<storedEmployee> iterator=hashtable[hashedKey].listIterator();
        storedEmployee st=null;
        int index=-1;
        while(iterator.hasNext())
        {
            st=iterator.next();
            index++;
            if(st.key.equals(key))
            {
               break;
            }
        }
        if(st==null)
        {
            return null;
        }
        else
        {
            hashtable[hashedKey].remove(index);
            return st.employee;
        }
    }

    public void print()
    {
        for(int i=0;i<hashtable.length;i++)
        {
            if(hashtable[i].isEmpty())
            {
                System.out.println("Position "+i+" : Empty");
            }
            else
            {
                System.out.print("Position "+i+" : ");

                ListIterator<storedEmployee> it=hashtable[i].listIterator();
                while(it.hasNext())
                {
                    System.out.print(it.next().employee+" -> ");
                }
                System.out.println(" -> Null");
            }
        }
    }


    public int hashKey(String key)
    {
        return key.length() %hashtable.length;
    }
}
