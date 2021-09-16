public class Bank 
{
    void getBalance()
    {}
    
}
class BankA extends Bank 
{
    void getBalance()
    {
        System.out.println(1000);
    }
}

class BankB extends Bank 
{
    void getBalance()
    {
        System.out.println(1500);
    }
}

class BankC extends Bank
{
    void getBalance()
    {
        System.out.println(2000);
    }
}

class checkBal
{
    public static void main(String[] args) {
        BankA obj = new BankA();
        obj.getBalance();
        BankB obj1 = new BankB();
        obj1.getBalance();
        BankC obj2 = new BankC();
        obj2.getBalance();
    }
}
