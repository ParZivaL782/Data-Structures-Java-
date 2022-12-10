package queue;
public class Employeee
{
    private String first;
    private String last;
    private int reg;
    
    public Employeee(String first,String last,int reg)
    {
        this.first=first;
        this.last=last;
        this.reg=reg;
    }

    public String toString()
    {
       return ("Employeee: " + first + ", " + last + ", " + reg);
    }
}    

