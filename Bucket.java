import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bucket 
{
    public static void main(String[] args) 
    {
        int[] arr = {10,43,76,34,75,33,23,87,98,53};
        sort(arr);
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
    
    public static void sort(int[] arr)
    {
        List<Integer>[] Buckets=new List[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            Buckets[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++)
        {
            Buckets[hash(arr[i])].add(arr[i]);
        }
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            Collections.sort(Buckets[i]);
            for(int val:Buckets[i])
            {
                arr[j++]=val;
            }
        }
    }
    public static int hash(int i)
    {
        return i/10;
    }
}
