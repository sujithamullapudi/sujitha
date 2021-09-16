public class A1 
{
    void printAreaSquare(int a)
    {
        System.out.println("area of square is " + a*a);
    }

    void printAreaRectangle(int l, int b)
    {
        System.out.println("area of rectangle is " + (l*b));
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        obj.printAreaRectangle(2, 3);
        obj.printAreaSquare(4);
    }
    
}
