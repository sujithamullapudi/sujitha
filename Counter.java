public class Counter 
{
    int i,count=0;
    void increment()
    {
        for(i=0; i<1; i++)
        {
            count = count+3;
            System.out.println("i="+count);
        }
    }
    
}
class Subcount extends Counter
{
    public static void main(String[] args)
    {
        Subcount obj = new Subcount();
        obj.increment();
    }
}