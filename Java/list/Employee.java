
package list;

public class Employee
{
    private String first;
    private String last;
    private int reg;
    
    public Employee(String first,String last,int reg)
    {
        this.first=first;
        this.last=last;
        this.reg=reg;
    }

    public String toString()
    {
       return ("Employee: " + first + ", " + last + ", " + reg);
    }
}