package Abstract;

public abstract class Parent 
{
    abstract void message();
    
}

class sub extends Parent 
{
    void message()
    {
        System.out.println("This is first subclass");
    }
}

class sub1 extends Parent 
{
    void message()
    {
        System.out.println("This is second subclass");
    }
}

class Abstract 
{
    public static void main(String[] args) {
        sub obj = new sub();
        obj.message();

        sub1 obj1 = new sub1();
        obj1.message();
    }
}