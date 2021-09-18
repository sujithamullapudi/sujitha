package Abstract;

public abstract class ShapeAbs 
{
    abstract void RectangleArea(int length, int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
    
}

class Area extends ShapeAbs
{
    void RectangleArea(int length, int breadth)
    {
        System.out.println("area of ractangle is " + (length*breadth));
    }

    void SquareArea(int side)
    {
        System.out.println("area of square is  " + (side*side));
    }

    void CircleArea(int radius)
    {
        System.out.println("area of circle is " + (3.14*radius*radius));
    }
}

class Driver1 
{
    public static void main(String[] args)
    {
        Area a = new Area();
        a.RectangleArea(2, 3);
        a.SquareArea(4);
        a.CircleArea(3);
    }
}