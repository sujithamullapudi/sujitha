public class Degree 
{
    void getDegree()
    {
        System.out.println("i got a degree");
    }
    
}

class Undergraduate extends Degree 
{
    void print()
    {
        System.out.println("i am an under graduate");
    }
}

class Postgraduate extends Degree 
{
    void print()
    {
        System.out.println("i am an postgraduate");
    }
}

class example
{
    public static void main(String[] args) {
        Postgraduate p = new Postgraduate();
        p.getDegree();
        p.print();
        Undergraduate u = new Undergraduate();
        u.print();
    }
}
