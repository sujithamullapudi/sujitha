package sujitha;
public class Counter 
{
    int i,counter=0;
    void increment()
    {
        for(i=0; i<1; i++)
        {
        counter = counter+3;
        System.out.println("i="+counter);
        }
    }
    
}
class Subcounter extends Counter 
{
    public static void main(String[] args) {
        Subcounter obj = new Subcounter();
        obj.increment();
    }
}