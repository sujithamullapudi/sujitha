public class In 

{
    private void print()
    {
        System.out.println("this is parent class");
    }
}
class Subclass1 extends In
{
    void show()
    {
        System.out.println("this is child class");
    }
    public static void main(String[] args) {
        Subclass1 obj = new Subclass1();
        obj.show();
        obj.print();

    }
}
