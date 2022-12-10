abstract class base
{
    base()
    {
        System.out.println("Base constructor is called.");
    }

    abstract void fun();
    
}

class derived extends base
{
    derived()
    {
        System.out.println("Derived function is called.");
    }
    void fun()
    {
        System.out.println("fun is fun");
    }
}

class GFG
{
    public static void main(String[] args) {
        derived d=new derived();
        d.fun();
    }
}















// abstract class shape
// {
//     public String color;
//     abstract double area();
//     public abstract String tostring();  
    
//     public shape(String c)
//     {
//         System.out.println("Shape constructor is called.");
//         this.color=c;
//     }
//     public String getcolor()
//     {
//         return this.color;
//     }

// }


// class circle extends shape
// {
//     int radius;
//     public circle(String c,int r)
//     {
//         super(c);
//         System.out.println("Circle constructor is called.");
//         this.radius=r;

//     }
//     double area()
//     {
//         return Math.PI*Math.pow(radius,2);
//     }
//     public String tostring()
//     {
//         return "Circle of color "+ super.getcolor()+" is  of area "+this.area();
//     }
// }

// class rectangle extends shape
// {
//     int length;
//     int breadth;

//     public rectangle(String c,int l,int b)
//     {
//         super(c);
//         System.out.println("Rectangle constructor is called.");
//         this.length=l;;
//         this.breadth=b;
//     }
//     public double area()
//     {
//         return length*breadth;
//     }
//     public String tostring()
//     {
//         return "Rectangle of color "+super.getcolor()+" have an area of "+this.area();
//     }
// }

// class test
// {
//     public static void main(String[] args) 
//     {
        
//         shape circle1=new circle("red",12);
//         System.out.println(circle1.tostring());

//         shape rec1=new rectangle("blue",10,15);
//         System.out.println(rec1.toString());
//     }
// }














// class arrofarr
// {
//     public static void main(String args[])
//     {
//         int arr[][]=new int[5][];
        
//         int count=1;
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=new int[i];
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 arr[i][j]=count++;
//             }
//         }

//         for(int a=0;a<arr.length;a++)
//         {
//             for(int b=0;b<arr[a].length;b++)
//             {
//                 System.out.print(arr[a][b]+" ");
//             }
//             System.out.println();
//         }

//     }

// }


// class lcm
// {
//     public static void main(String args[])
//     {
//         int a=12;
//         int b=15;
//         int greater=0,lower=0;
//         if(a>b)
//         {
//             greater = a;
//             lower = b;
//         }
//         else
//         {
//             greater=b;
//             lower = a;
//         }
//         int c=0,d=0;
//         int lcm=0;

//     for(int i=1;i<=lower;i++)
//     {
//         c=greater*i;

//         for(int j=1;j<=greater;j++)
//         {
//             d=lower*j;
//             if(d>c)
//             {
//                 break;
//             }
//             if(c==d)
//             {
               
//                 break;
//             }
//     }

//     if(c==d)
//     {
//         lcm=d;
//         break;
//     }
    
// }
// System.out.println(lcm);
//     }

// }









// import java.io.*;
// class Test 
// {
//     public static void main(String[] args)
//     {
//         System.out.println("Hello there this is main main");
//         Test.main("parzivl");
//     }

//     public static void main(String args1)
//     {
//         System.out.println("Hello "+args1);
//         Test.main("Helen","Melon");
//     }

//     public static void main (String args1, String args2)
//     {
//         System.out.println("hello "+args1+" "+args2);

//     }

// }










// class A
// {
//     public void fun()
//     {
//         System.out.println("A is funn.");
//     }
// }

// class B extends A
// {
//     public void fun()
//     {
//         System.out.println("B is fun");
//     }
// }

// class C extends B
// {
//     public void fun()
//     {
//         System.out.println("C is fun");
//     }
// }

// class shit
// {
//     public static void main(String args[])
//     {
//     A a = new A();
//     B b = new B();
//     C c = new C();
     
//     A ref;
//     ref = a;
//     ref.fun();

//     ref=b;
//     ref.fun();

//     ref=c;
//     ref.fun();
//     }
// }














// class p1
// {
//     private int a;
//     p1(int x)
//     {
//         a=x;
//         System.out.println("The base constructor called.");
//     }
// }

// class p2 extends p1
// {
//   private int b;
//     p2(int x,int y)
//     {
//         super(x);
//         b=y;
//         System.out.println("The 2nd parent costructor called.");
//     }
// }

// class Video_Games 
// {
//     public static void main(String args[])
//     {
//         p2 bonni=new p2(69,420);
        
//     }
// }



// interface gameplay
// {
//      default void played()
//     {
//         System.out.println("Dattebayo!");
//     }
     
// }

// interface body
// {
//     default void menu()
//     {
//         System.out.println("play or not upto you.");
//     }
// }


// class Video_Games implements gameplay,body 
// {
//    public void display()
//    {
//        gameplay.super.played();
//        body.super.menu();
//    }

//    public static void main(String args[])
//    {
//         Video_Games gta =new Video_Games();
//         gta.display();
//    }
// }
// class nfs extends Video_Games 
// {

// }
// class rockstar extends Video_Games 
// {

// }

// class gta_5 extends rockstar
// {
//     public static void main(String args[])
//     {
//         gta_5 cj =new gta_5();

//         System.out.println(cj instanceof Video_Games);
//         System.out.println(cj instanceof rockstar);
//     }
// }