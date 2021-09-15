public class Print 
{
    void display(int a, char b)
    {
        System.out.println("integer is " + a);
        System.out.println("character is " + b);
    }

    void display(char b, int a)
    {
        System.out.println("character is " + b);
        System.out.println("integer is " + a);
    }
    
    public static void main(String[] args) 
    {
        Print obj = new Print();

       
        obj.display('S', 10);
        obj.display(90, 'A');

    }
}
