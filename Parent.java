public class Parent 
{
    public static void print()
    {
        System.out.println("parent class");
    }
    
}

class Child extends Parent
{
    public static void print()
    {
        System.out.println("child class");
    }
}

class ParentChild
{
    public static void main(String[] args) 
    {
        Parent.print();
        Child.print();
    }
}
