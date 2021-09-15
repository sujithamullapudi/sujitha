public class A 
{
    int i=10,j=20;
    A()
    {
        System.out.println("In parent class constructor");
    }
    void show()
    {
        System.out.println(i);
        System.out.println(j);
    }
}

class B extends A 
{
    int k=30;
    B()
    {
        System.out.println("In child class constructor");
    }
    void show()
    {
        System.out.println(k);
    }
}
class Driver
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.show();
    }
}