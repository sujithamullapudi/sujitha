public class Rectangle 
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
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
}
class Square extends Rectangle
{
    int side;
    public Square(int s)
    {
        super(s,s);
    }
}

class Main1 
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3, 4);
        r.printArea();
        r.printPerimeter();
        Square s = new Square(2);
        s.printArea();
        s.printPerimeter();
    }
}
