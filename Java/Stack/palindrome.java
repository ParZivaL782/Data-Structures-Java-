import java.util.Scanner;
import java.util.Stack;

class Spalindrome
{

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The String");
            String input=sc.nextLine();

            input=input.replaceAll("\\p{Punct}", "");

            Stack<Character> st=new Stack<Character>();    
            int check=0;

            for(int i=0;i<input.length();i++)
            {
                st.push(input.charAt(i));
            }

            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)!=st.pop())
                {
                    check+=1;
                    break;
                }
            }

            if(check==0)
            {
                System.out.println("String is palindrome");
            }
            else
            {
                System.out.println("String is not palindrome");
            }
        }

    }
}


