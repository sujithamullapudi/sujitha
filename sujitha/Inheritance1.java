package sujitha;

public class Inheritance1 
{
    void display()
    {
        System.out.println("this is parent class");
    }
}
class Inh extends Inheritance1
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