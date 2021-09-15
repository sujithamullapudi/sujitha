public class Rectangle 
{
    int length;
    int breadth;
    
    Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    void printArea()
    {
        System.out.println(length*breadth);
    }
    void printPerimeter()
    {
        System.out.println(2*(length+breadth));
    }
}

class Square extends Rectangle
{
    int side;

    Square(int s)
    {
        super(s,s);
    }
}

class Ans
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        r.printArea();
        r.printPerimeter();

        Square s = new Square(2);
        s.printArea();
        s.printPerimeter();

    }
}