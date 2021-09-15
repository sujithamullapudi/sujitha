public class Member 
{
    String name;
    int age;
    String number;
    String address;
    int salary;
    void printSalary()
    {
        System.out.println(salary);
    }   
}
class Employee extends Member
{
    String specialization;
}
class Manager extends Member
{
    String departement;
}
class Main 
{
    public static void main(String[] args) 
    {
        Employee e = new Employee();
        e.name="sujitha";
        e.age=19;
        e.number="8179224536";
        e.address="chmilli";
        e.salary=1034;
        e.specialization="doctor";


        Manager m = new Manager();
        m.name="suji";
        m.age=20;
        m.number="8179344536";
        m.address="elr";
        m.salary=2034;
        m.departement="cse";

        e.printSalary();
        m.printSalary();


    }
}