public class Counter 
{
    int myCount;
     public Counter ( ) 
     {
        myCount = 0;
     }
     public void increment ( ) 
     {
        myCount++;
     }
    
}
class sub extends Counter
{
    int num;
    public sub(int n) 
    {
        num = n;
    }
class Test1 
{
    public static void main(String[] args) 
    {
        sub obj = new sub(3);
        obj.increment();
    }
}