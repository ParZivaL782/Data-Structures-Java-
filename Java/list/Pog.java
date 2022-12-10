package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Pog
{
    public static void main(String[] args) throws Exception 
    {
        // List<Employee> employeelist=new ArrayList<>();
        // employeelist.add(new Employee("prit","anghan",567));
        // employeelist.add(new Employee("karnak","oza",5987));
        // employeelist.add(new Employee("raghav","vivek",56987));
        // employeelist.add(new Employee("pratham","bansal",567));

        //employeelist.forEach(employee->System.out.println(employee));
        // System.out.println(employeelist.size());
        // employeelist.toArray();
        // Object[] employeearray=employeelist.toArray();
        // System.out.println(employeearray[1].toString());


        Employee prit =new Employee("Prit", "Anghan", 567);
        Employee karnak =new Employee("karnak", "Oza", 5987);
        Employee Ragahv =new Employee("rahghav", "Vivek", 5997);
        Employee Pratham =new Employee("Pratham", "Bansal", 5672);
        Employee Parzivl=new Employee("Parzivl", "BAckend", 6969);

        EmployeeDoublylinkedlist employelist = new EmployeeDoublylinkedlist();
        employelist.addToFront(prit);
        employelist.addToFront(karnak);
        employelist.addToFront(Ragahv);
        employelist.addToFront(Pratham);
        employelist.addBefore(Parzivl,karnak);

       

        // employelist.removeHead();
        employelist.printList();

        // LinkedList<Employee> list=new LinkedList<>();

        // list.add(prit);
        // list.add(karnak);
        // list.add(Ragahv);
        // list.add(Pratham);
        // list.addLast(Parzivl);

        // Iterator iter=list.iterator();
        //  while(iter.hasNext())
        //  {
        //      System.out.println(iter.next());
        //  }



        

    }
}