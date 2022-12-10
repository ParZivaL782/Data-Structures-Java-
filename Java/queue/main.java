package queue;
public class main
{
    public static void main(String[] args) 
    {
        
        Employeee prit =new Employeee("Prit", "Anghan", 567);
        Employeee karnak =new Employeee("karnak", "Oza", 5987);
        Employeee Ragahv =new Employeee("rahghav", "Vivek", 5997);
        Employeee Pratham =new Employeee("Pratham", "Bansal", 5672);
        Employeee Parzivl=new Employeee("Parzivl", "BAckend", 6969);
        
        arrayQueue queue=new arrayQueue(10);
        queue.add(prit);
        queue.add(karnak);
        queue.add(Ragahv);
        queeu.add(Pratham);

        queue.printQueue();
    }
}