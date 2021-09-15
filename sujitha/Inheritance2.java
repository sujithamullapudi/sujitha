package sujitha;
public class Inheritance2 
{
    private void display()
    {
        System.out.println("this is parent class");
    }
}
class Inh extends Inheritance2
{
    void show()
    {
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        Inh obj = new Inh();
        obj.display();
        obj.show();
    }
}
