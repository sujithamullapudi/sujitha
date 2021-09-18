package Abstract;

public abstract class Animals 
{
    abstract void cats();

    abstract void dogs();
}

class Cats extends Animals 
{
    void cats()
    {
        System.out.println("cats meow");
    }
}

class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("dogs bark");
    }
}

class abs 
{
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.dogs();
        Cats c = new Cats();
        c.cats();
    }
}