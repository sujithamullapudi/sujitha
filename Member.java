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

class Test 
{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="xyz";
        e.age=20;
        e.number="7988665";
        e.address="elr";
        e.salary=1234;
        e.specialization="cse";
        e.printSalary();

        Manager m = new Manager();
        m.name="xyz";
        m.age=20;
        m.number="7988665";
        m.address="elr";
        m.salary=3322;
        m.departement="cse";
        m.printSalary();


    }
}