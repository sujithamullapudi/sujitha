public class Print1 
{
    int i;
    void printNum()
    {
        System.out.println(i);
    }
    
}
class subPrint extends Print1
{
    int j;
    void printNum()
    {
        System.out.println(j);
    }
}

class printExample
{
    public static void main(String[] args) 
    {
        subPrint obj = new subPrint();
        obj.i=20;
        obj.j=50;
        obj.i = obj.j;
        obj.printNum();
        
    }
}
