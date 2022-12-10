
class Main
{
    public static void main(String[] args) 
    {
    Tree tr=new Tree();
    tr.insert(25);  
    tr.insert(20);
    tr.insert(15);
    tr.insert(27);  
    tr.insert(30);
    tr.insert(29);
    tr.insert(26);
    tr.insert(22);
    tr.insert(32);
    tr.insert(17);


    tr.preOrder();
    System.out.println();
    System.out.println(tr.min());
    tr.delete(22);
    tr.preOrder();


    }
}