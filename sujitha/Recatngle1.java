package sujitha;
public class Recatngle1 
{
    int length,breadth;

    void printArea()
    {
        System.out.println(length*breadth);
    }

    void printPerimeter()
    {
        System.out.println(2*(length+breadth));
    }
    Recatngle1(int l, int b)
    {
        length=l;
        breadth=b;
    }
}
class Square extends Recatngle1
{
    int side;
    public Square(int s)
    {
        super(s,s);
    }
}
class Main2 
{
    public static void main(String[] args)
    {
        Recatngle1 r = new Recatngle1(3, 4);
        r.printArea();
        r.printPerimeter();

        Square s = new Square(2);
        s.printArea();
        s.printPerimeter();

        Square[] a = new Square[10];
        int k=5;
        for(int i=0; i<10; i++)
        {
            a[i] = new Square(k);
            k++;
        }
        for(int i=0; i<10; i++)
        {
            a[i].printPerimeter();
            a[i].printArea();
        }
    }
}
