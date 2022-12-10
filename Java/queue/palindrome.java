import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
public class palindrome 
{
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the String");
            String input=sc.nextLine();
            String nopunct=input.replaceAll("\\p{Punct}", "");
            System.out.println(nopunct);
            System.out.println(nopunct.length());
            int l=nopunct.length();

            // if(nopunct.contains(" "))
            // {
            //     String[] sp=nopunct.split(" ");
            //     nopunct="";
            //     for(String i:sp)
            //     {
            //         nopunct=nopunct+i;
            //     }
                
            // }
            
            Stack<Character> s=new Stack<Character>();
            for(int i=0;i<l;i++)
            {
                s.push(nopunct.charAt(i));
            }
            System.out.println(s);

            Queue<Character> s2=new  ArrayBlockingQueue<>(l);
            for(int i=0;i<l;i++)
            {
                s2.add(nopunct.charAt(i));
            }
            System.out.print(s2);
            
            int check=0;
           while(!s.isEmpty())
            {
                if(s2.poll()!=s.pop())
                {
                    check=1;
                    break;
                }
            }
            System.out.println(s);
            System.out.println(s2);

            if(check==1)
            {
                System.out.println("NOT-PALINDROME");
            }
            else
            {
                System.out.println("PALINDROME");
            }

        }
}
