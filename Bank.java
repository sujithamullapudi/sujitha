package Abstract;

public abstract class Bank 
{
    abstract void getBalance();
}

class BankA extends Bank 
{
    void getBalance()
    {
        System.out.println(100);
    }
}

class BankB extends Bank 
{
    void getBalance()
    {
        System.out.println(150);
    }
}

class BankC extends Bank
{
    void getBalance()
    {
        System.out.println(200);
    }
}

class Money 
{
    public static void main(String[] args) 
    {
        BankA obj1 = new BankA();
        obj1.getBalance();

        BankB obj2 = new BankB();
        obj2.getBalance();

        BankC obj3 = new BankC();
        obj3.getBalance();
        
    }
}