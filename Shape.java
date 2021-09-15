public class Shape 
{
    public void print_shape()
    {
        System.out.println("This is shape");
    }
}
    
class Rectangle2 extends Shape
    {
      public void print_rect()
      {
        System.out.println("This is rectangular shape");
      }
    }
    
class Circle extends Shape
{
      public void print_circle()
      {
        System.out.println("This is circular shape");
      }
}
    
class Square2 extends Rectangle2
{
      public void print_square()
      {
        System.out.println("Square is a rectangle");
      }
}
class Test1
{
      public static void main(String[] args)
      {
        Square2 sq = new Square2();  
        sq.print_shape();    
        sq.print_rect();    
      }
    
}
