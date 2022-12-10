// class myecept extends Exception
// {
//     public static int rollno[]={1,2,3,4,5,6};
//     public static String name[]={"ramesh","suresh","prakash","rohit","punit","v"};
//     public static int marks[]={67,87,56,98,32,1};

//     myecept(String str){super(str);}

//     public static void main(String[] args) {
//         System.out.println("rollno"+"\t"+"name"+"\t"+"marks");
//         try 
//         {
//             for(int i =0;i<6;i++)
//             {
//                 System.out.println(rollno[i]+"\t"+name[i]+"\t"+marks[i]);
//                 if(marks[i]<50)
//                 {
//                     myecept except=new myecept("You pathetic loser..");
//                     throw except;
//                 }
//             }    
//         } 
//         catch (myecept e) 
//         {
//             e.printStackTrace();
//         }
//     }


// }
// import java.io.*;
// class myexcept extends Exception
// {
//     public static void main(String[] args) throws IOException
//     {
       
//         try
//         {
//             FileReader file=new FileReader("P:\\test.txt");
//             BufferedReader fileinput =new BufferedReader(file);
//             for(int i=0;i<4;i++)
//         {
//             System.out.println(fileinput.readLine());
//         }
//         fileinput.close();
//         }
//         catch(Exception e)
//         {
//             System.out.println("Check the path or the file.");
//         }
//     }
// }
// class something extends Exception
// {
//     something(String str){super(str);}
//     public static fun()
//     {
//         try
//         {
//             throw new something("an error");
//         }
//         catch(something e)
//         {
//             System.out.println("Inside fun()");

//             throw new something("an error");
//         }

//     }
//     public static void main(String[] args) {
//         try
//         {
//             something.fun();
//         }
//         catch(Exception ex)
//         {
//             System.out.println("Inside main()");
//         }
//     }

// }
// import java.util.*;
// class GFG
// {
//     public static void main(String[] args) {
//         List<String> str=new LinkedList<String>();
//         str.add("huithu");
//         str.add("Skthu");
//         str.add("Hoirong");

//         Collections.addAll(str, "bokachoda","zok");
//         System.out.println(str);
//     }
// }