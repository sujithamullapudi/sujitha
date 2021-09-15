package sujitha;
public class Shape 
{
    void printShape()
    {
        System.out.println("this is shape");
    }
}
class Rectangle3 extends Shape 
{
    void printRec()
    {
        System.out.println("this is rectangle shape");
    }
}
class Circle extends Shape
{
    void printCircle()
    {
        System.out.println("this is circle shape");
    }
}
class Square1 extends Rectangle3
{
    void printSquare()
    {
        System.out.println("square is a rectangle");
    }
}
class Test 
{
    public static void main(String[] args) {
        Square1 s = new Square1();
        s.printShape();
        s.printRec();
    }
}