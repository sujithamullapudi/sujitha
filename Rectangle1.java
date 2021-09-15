public class Rectangle1 
{
    int length;
    int breadth;
    
    Rectangle1(int l, int b)
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

class Square extends Rectangle1
{
    int side;

    Square(int s)
    {
        super(s,s);
    }
}

class Ans1
{
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(2,3);
        r.printArea();
        r.printPerimeter();

        Square s = new Square(2);
        s.printArea();
        s.printPerimeter();

        Square [] a = new Square[10];
        int k=5;
        for(int i=0; i<10; i++)
        {
            a[i] = new Square(k);
            k++;
        }

        for(int i=0; i<10; i++)
        {
            a[i].printArea();
            a[i].printPerimeter();
        }

    }
}