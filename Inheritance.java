public class Inheritance 

{
    void print()
    {
        System.out.println("this is parent class");
    }
}
class Subclass extends Inheritance
{
    void show()
    {
        System.out.println("this is child class");
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.show();
        obj.print();

    }
}
