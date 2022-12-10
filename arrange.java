import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// class stackquene
// {
//     static Stack<Integer> st1=new Stack<Integer>();
//     static Stack<Integer> st2=new Stack<Integer>();

//     public void enQuene(int x)
//     {
//         st1.push(x);
//     }

//     public static int dequene()
//     {
//         int x,res=0;
//         if(st1.isEmpty())
//         {
//             System.out.println("Quene is Empty");
//             System.exit(0);
//         }
//         else if(st1.size()==1)
//         {
//             return st1.pop();
//         }
//         else
//         {
//             x=st1.pop();
//             res=dequene();
//             st1.push(x);
//             return res;
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         stackquene q =new stackquene(); 
//         q.enQuene(1);
//         q.enQuene(2);
//         q.enQuene(3);

//         System.out.println(q.dequene());
//         System.out.println(q.dequene());
//         System.out.println(q.dequene());


        
//         }
//     }

// class stackmin
// {
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<Integer>();
 
//         int[] arr = { 3, 2, 6, 1, 8, 5, 5, 5, 5 };
 
//         for (int i = 0; i < arr.length; i++) 
//         {
//             st.push(arr[i]);
//             st.getMin();
//         }
//         System.out.println();
//         for (int i = 0; i < arr.length; i++) 
//         {
//             st.pop();
//             st.getMin();
        
//         }
// }
// }


class Buubble
{
    

    static void swap(int arr[],int i,int j)
    {
        int temp=-1;
        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }


    //Bubble sort
    //....................................................
    // static void sort(int arr[])
    // {
    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //         for(int j=0;j<arr.length-i-1;j++)
    //         {
    //             if(arr[j]>arr[j+1])
    //             {
    //                 swap(arr,j);
    //             }
    //         }
    //     }
    // }
    //......................................................

    // Selection Sort
    //.......................................
    // static void sort(int arr[])
    // {
    //     int max;
    //     for(int i=arr.length-1;i>0;i--)
    //     {
    //         max=0;
    //         for(int j=0;j<=i;j++)
    //         {
    //             if(arr[max]<arr[j])
    //             {
    //                 max=j;
    //             }
    //         }
    //         swap(arr, max, i);
    //     }
    // }
    //............................................

    //insertion sort
    //...........................................
    // static void sort(int arr[])
    // {
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         int temp=arr[i];
    //         int j;
    //         for(j=i;j>0 && temp<arr[j-1];j--)
    //         {
    //                 arr[j]=arr[j-1];
    //         }
    //         arr[j]=temp;
            
    //     }
    // }
    //...............................................

    //shell sort
    ///...................................

    // static void sort(int arr[])
    // {
    //     for( int gap=arr.length/2 ; gap>0 ; gap/=2 )
    //     {
    //         for(int i=gap;i<arr.length;i++)
    //         {
    //             int temp=arr[i];
    //             int j=i;
    //             while(j>=gap && temp<arr[j-gap])
    //             {
    //                 arr[j]=arr[j-gap];
    //                 j-=gap;
    //             }
    //             arr[j]=temp;
    //         }
    //     }
    // }
    //.............................................

    //shell-bubble
    //................................................
    // public static void sort(int arr[])
    // {
    //     for(int gap=arr.length/2;gap>0;gap/=2)
    //     {
    //         for(int i=gap;i<arr.length;i++)
    //         {
    //             for(int j=0;j<i;j++)
    //             {
    //                 if(arr[j]>arr[i])
    //                 {
    //                     swap(arr, i, j);
    //                 }
    //             }
    //         }
    //     }
    // }
    //...................................................

    ///merge sort
    //..............................................

    // public static void merge(int arr[],int start,int mid,int end)
    // {
    //     if(arr[mid-1] <= arr[mid])
    //         return;
        
    //     int i=start;
    //     int j=mid;
    //     int tempindex=0;
    //     int[] temp=new int[end-start];
        
    //     while(i<mid && j<end)
    //     {
    //         temp[tempindex++] = arr[i]<=arr[j] ? arr[i++] : arr[j++];
    //     }

    //     System.arraycopy(arr, i, arr, start+tempindex, mid-i);
    //     System.arraycopy(temp, 0, arr, start, tempindex);
    // } 

    // public static void mergesort(int arr[],int start, int end)
    // {
    //     if(end-start<2)
    //     {
    //         return;
    //     }
    //     int mid=(start+end)/2;
    //     mergesort(arr, start, mid);
    //     mergesort(arr, mid, end);
    //     merge(arr,start,mid,end);
    // }
    //.......................................................

    //quick sort
    //............................................................
    // static void quicksort(int arr[],int start ,int end)
    // {
    //     if(end-start<2)
    //         return;
        
    //     int pivotindex=partition(arr,  start,  end);
    //     quicksort(arr, start, pivotindex);
    //     quicksort(arr, pivotindex+1, end);
    // }

    // static int partition(int arr[],int start,int end)
    // {
    //     int pivot=arr[start];
    //     int i=start;
    //     int j=end;

    //     while(i<j)
    //     {
    //         while(i<j && arr[--j]>=pivot);
    //         if(i<j)
    //             arr[i]=arr[j];

    //         while(i<j && arr[++i]<=pivot);
    //         if(i<j)
    //         {
    //             arr[j]=arr[i];
    //         }
    //     }
    //     arr[j]=pivot;
    //     return j;
    // }
    //................................................................

    //counting sort
    //.................................................................
    // static void countingsort(int arr[],int min, int max)
    // {
    //     int countarr[]=new int[(max-min)+1];
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         countarr[arr[i]-min]++;
    //     }

    //     int j=0;
    //     for(int i=min;i<=max;i++)
    //     {
    //         while(countarr[i-min]>0)
    //         {
    //             arr[j++]=i;
    //             countarr[(i-min)]--;
    //         }
    //     }
    // }
    //.................................................................

    //merge sort descending
    //,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    // public static void mergesort(int arr[],int start,int end)
    // {
    //     if((end-start)<2)
    //     {
    //         return;
    //     }
    //     int mid=(end+start)/2;
    //     mergesort(arr,start,mid);
    //     mergesort(arr,mid,end);
    //     sort(arr,start,mid,end);

    // }
    // public static void sort(int arr[],int start,int mid,int end)
    // {
    //     if(arr[mid-1]>=arr[mid])
    //     {
    //         return;
    //     }
    //     int i=start;
    //     int j=mid;
    //     int tempindex=0;
    //     int temp[]=new int[end-start];
    //     while(i<mid && j<end)
    //     {
    //         temp[tempindex++] = arr[i]>=arr[j]?arr[i++] : arr[j++];
    //     }
    //     System.arraycopy(arr,i,arr,start+tempindex,mid-i);
    //     System.arraycopy(temp,0,arr,start,tempindex);
    // }
    //...............................................................................

    //recursive insertion sort
    //..................................................................................


        //{20,35,15,-22,-6,8,4}
    // public static int insert(int arr[],int temp,int j)
    // {
    //     if(j<1)
    //     {
    //         return 0;
    //     }
    //     else if(j>0 && arr[j-1]>temp)
    //     {
    //         arr[j]=arr[j-1];
    //         j-=1;
    //         insert(arr,temp,j);
    //     }
    //     else
    //     {  
    //         return j;
    //     }
    //     return 0;

    // }
    // public static void insertsort(int arr[],int i)
    // {
    //     if(i==arr.length)
    //     {
    //         return;
    //     }
    //     int j=i;
    //     int temp=arr[i];
    //     arr[insert(arr,temp,j)]=temp;
    //     i+=1;
    //     insertsort(arr,i);
      
    // }

    public static void insertionsort(int arr[],int n)
    {
        if(n<2)
        {
            return;
        }
        insertionsort(arr, n-1);
        int temp=arr[n-1];
        int j;
        for(j=n-1; j>0 && arr[j-1]>temp ;j--)
        {
            arr[j]=arr[j-1];
        }
        arr[j]=temp;
    }

    static void print(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) 
    {
        int arr[]={20,35,15,-22,-6,8,4};

        insertionsort(arr,arr.length);
        print(arr);
    }
}



