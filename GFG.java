
import java.util.*;

import org.w3c.dom.Node;

import java.io.*;

// class GFGF {
//     public static void input(Stack<Integer> stack)
//     {
//         for(int i=1;i<6;i++)
//         {
//             stack.push(i);
//         }
//     }
//     public static void output(Stack<Integer> stack)
//     {
//         for(int i:stack)
//         {
//             int y=(Integer)stack.pop();
//             System.out.println(y);
//         }
//     }
//     public static void find(Stack<Integer> stack,int element)
//     {
//         int pos=(Integer)stack.search(element);
//         if(pos==-1)
//         {
//             System.out.println("element not found");
//         }
//         else
//         {
//             System.out.println("Position of element is "+pos);
//         }
//     }
//     public static void main(String[] args) 
//     {
//         GFGF stack1=new GFGF();
//         Stack<Integer> stack=new Stack();
//         stack1.input(stack);
//         stack1.output(stack);
//         stack1.input(stack);
//         stack1.find(stack,3);
//         stack1.find(stack,69);    

//     }    
// }

// class GFGF
// {
//     public static void main(String[] args) {
//         LinkedList<String> l1=new LinkedList<String>();
//         l1.add("chutiya");
//         l1.addFirst("Raghav");
//         l1.addLast("hai");
//         for(String s:l1)
//         {
//             System.out.print(s+" ");
//         }
//     }
// }
// class GFGF
// {
//     public static void main(String[] args) 
//     {
//         PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>();
//         pqueue.add(69);
//         pqueue.add(99);
//         pqueue.add(79);
//         System.out.println(pqueue);
//         for(int i:pqueue)
//         {
//             System.out.print(i+" ");
//         }
//         Iterator it=pqueue.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next()+" ");
//         }

//         System.out.println(pqueue.peek());
//         System.out.println(pqueue.poll());
//         System.out.println(pqueue.peek());

//     }
// }

// import java.io.*;
// class GFGF
// {
//     public static void main(String args[])
//     {
//         SortedMap<Integer,String> sm1=new TreeMap<Integer,String> ();

//         sm1.put(new Integer(1),"bahdwa");
//         sm1.put(new Integer(2), "Kutrina");
//         sm1.put(new Integer(3), "huithu");
//         sm1.put(new Integer(4), "skthu");
//         Set s=sm1.entrySet();

//         Iterator i=s.iterator();
//         while(i.hasNext())
//         {
//             Map.Entry m=(Map.Entry)i.next();
            
//             int key=(Integer)m.getKey();
//             String value=(String)m.getValue();
//             System.out.println("KEy :"+key +" value :"+value);
//         }
//     }
// }

// class GFGF extends Thread
// {
//     public void run()
//     {
//         try
//         {
//             System.out.println("Thread "+Thread.currentThread().getId()+" is running");
           
//         }
//         catch(Exception e)
//         {
//             System.out.println("exception dumbass");
//         }
//     }
//     public static void main(String[] args) 
//     {
//         GFGF ob =new GFGF();
//         ob.run(); 
//     }
// }


// import java.io.*;
// class filehandeling
// {
//     public static void main(String[] args) 
//     {
//         try{
//         BufferedReader bw=new BufferedReader(new FileReader("P:\\test.txt"));
//         String s;
//         while((s=bw.readLine())!=null)
//         {
//             System.out.println(s);
//         }
//         bw.close();
//         }
//         catch(IOException ex)
//         {
//             return;
//         }

//     }
// }

// import java.io.*;
// import java.lang.reflect.Array;
// class ArrayRotation
// {
//     public static void rotate(int arr[],int d,int n)
//     {
//         int j=1;
//         for(int i= 0;i<n;i++)
//         {
//             arr[i]=j;
//             j++;
//         }


//         int temp=0;
//         for(int i=0;i<d;i++)
//         {
//             temp=arr[0];
//             for(int p=1;p<n;p++)
//             {
//                 arr[p-1]=arr[p];   
//             }
//             arr[n-1]=temp;
//         }


//         System.out.println("Rotated array is:-");
//         for(int i:arr)
//         {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[])
//     {
        
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter the length of array:-");
//         int n=sc.nextInt();
//         System.out.println("Enter the number of rotations");
//         int d=sc.nextInt();

//         int arr[]=new int[n];
//         ArrayRotation.rotate(arr, d, n);
//     }
// }

// import java.io.*;
// class ArrayRotation
// {
//     public static void reverse(int arr[],int start,int end)
//     {
//         int temp;
//         while(start<end)
//         {
//             temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//     }

//     public static void rotate(int arr[],int d,int n)
//     {
//         if(d<=0||d>n)
//         {
//             return;
//         }

//         ArrayRotation.reverse(arr, 0, d-1);
//         ArrayRotation.reverse(arr, d, n-1);
//         ArrayRotation.reverse(arr, 0, n-1);
//     }
//     public static void print(int arr[])
//     {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8};
//         int n=arr.length;
//         int d=3;
//         ArrayRotation.rotate(arr,d,n);
//         ArrayRotation.print(arr);
//     }
// }

// import java.io.*;
// class ArrayRotation
// {
//     public static void swap(int arr[],int f1,int si,int d)
//     {
//         int i,temp;
//         for(i=0;i<d;i++)
//         {
//             temp=arr[f1+1];
//             arr[f1+i]=arr[si+i];
//             arr[si+1]=temp;
//         }
//     }
//     public static void rotate(int arr[],int d,int n)
//     {
//         int i,j;
//         i=d;
//         j=n-d;
//         while(i!=j)
//         {
//             if(i<j)
//             {
//                 swap(arr, d-i, d+j-i, i);
//                 j-=i;
//             }
//             else{
//                 swap(arr,d-i, d, j);
//                 i-=j;
//             }
//         }
//         swap(arr, d-i, d, i);
//     }
//     public static void print(int arr[])
//     {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }

//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8};
//         int d=3;
//         int n=arr.length;
//         ArrayRotation.rotate(arr, d, n);
//         ArrayRotation.print(arr);
        
//     }
// }






// import java.io.*;

// class rearranging
// {
//     public static void arrange(int arr[],int n)
//     {
//         int temp;      
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[j]==i)
//                 {
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]!=i)
//             {
//                 arr[i]=-1;
//             }
//         }

//     }

//     public static void print(int arr[])
//     {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }

//     public static void main(String[] args) 
//     {
//         int n;
//         Scanner sc=new Scanner(System.in);    
//         System.out.println("The length of array is?");
//         n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the array");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         rearranging.arrange(arr, n);
//         print(arr);
//     }
// }

// class rearrange
// {
//     public static void arrange(int arr[],int n)
//     {
//         int x=0,y=0;
//         for(int i=0;i<n;i++)
//         {
//               if((arr[i]!=-1)&&arr[i]!=i)
//                 {
//                     x=arr[i];
//                 }
//                 while(arr[x]!=-1&&arr[x]!=x)
//                 {
//                     y=arr[x];
//                     arr[x]=x;
//                     x=y;
//                 }
//                 arr[x]=x;
//                 if(arr[i]!=i)
//                 {
//                     arr[i]=-1;
//                 }
//                 }
       
//     }
//     public static void print(int arr[])
//     {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }

//     public static void main(String[] args) 
//     {
       
//         int n;
//         Scanner sc=new Scanner(System.in);    
//         System.out.println("The length of array is?");
//         n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the array");
//         for(int i=0;i<n;i++)
//         {
//             try {
//                 arr[i]=sc.nextInt();
//             } catch (Exception e) {
//                 continue;
//             }
            
//         }
//         rearrange.arrange(arr, n);
//         print(arr);
   
//     }
// }




// class rearrange
// {
   

//     public static void arrange(int arr[],int n)
//     {
//         int temp;
//         int i=0;
//         while(i<n)
//         {
//             if(arr[i]>=0 && arr[i]!=i)
//             {
//                 temp=arr[arr[i]];
//                 arr[arr[i]]=arr[i];
//                 arr[i]=temp;
//             }
//             else
//             {
//                 i++;
//             }
//         }
//     }
//         public static void print(int arr[])
//     {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }

//     public static void main(String[] args) 
//     {
       
//         int n;
//         Scanner sc=new Scanner(System.in);   

//         System.out.println("The length of array is?");
//         n=sc.nextInt();

//         int arr[]=new int[n];
//         System.out.println("Enter the array");
//         for(int i=0;i<n;i++)
//         {
//                 arr[i]=sc.nextInt();
            
//         }

        
//         rearrange.arrange(arr, n);
//         print(arr);
//     }
// }


// class reverse
// {
//     public static void rev(int arr[]) 
//     {
//         int s=0;
//         int l=arr.length-1;
//         while(s<l)
//         {
//             int temp=arr[s];
//             arr[s]=arr[l];
//             arr[l]=temp;
//             s++;
//             l--;
//         }    
//     }

//     public static void print(int arr[])
//      {
//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }    
//     }
//     public static void main(String[] args) {
//         int arr[]={9,8,7,6,5,4,3,2,1};
//         rev(arr);
//         print(arr);
//     }
// }

// class rearrange2
// {
//     public static void arrange(int arr[]) 
//     {
//         int evenPos = arr.length/2;
//         int oddpos = arr.length-evenPos;

//         int temparr[]=new int [arr.length];

//         for(int i=0;i<arr.length;i++)
//         {
//             temparr[i]=arr[i];
//         }
//         Arrays.sort(temparr);

//         int j=oddpos-1;

//         for(int i=0;i<arr.length;i+=2)
//         {
//             arr[i] = temparr[j];
//             j--;
//         }

//         j=oddpos;

//         for(int i=1;i<arr.length;i+=2)
//         {
//             arr[i]=temparr[j];
//             j++;
//         }

//         for(int i:arr)
//         {
//             System.out.print(i+" ");
//         }
//     }

//     public static void main(String[] args) 
//         {
//             int arr[]=new int[]{1,2,3,4,5,6,7};
//             rearrange2.arrange(arr);
//         }

// }



// class linkedlist

// {
//     Node head;

//     static class Node
//     {
//         int data;
//         Node next;
//         Node(int d)
//         {
//             this.data=d;
//             next=null;
//         }
//     }

//     public void print()
//     {
//         Node n = head;
//         while  (n!=null)
//         {
//             System.out.print(n.data+" ");
//             n=n.next;
//         }
//     }

//     public static void main(String[] args)
//     {
//         LinkedList llist=new LinkedList();
        
//         llist.head =new Node(1);
//         Node second = new Node(2);
//         Node third =new Node(3);

//         llist.head.next =second;
//         second.next=third;

//         llist.print();
//     }
// }

// class recfac
// {
//     static int recfac(int num)
//     {
//         if(num==0)
//         {
//             return 1;
//         }
//         return num*recfac(num-1);
//     }
//     public static void main(String[] args)
//      {
//         int fac=recfac(10);
//         System.out.println(fac);
//     }
// }



