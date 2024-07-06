abstract class Employee{
   abstract  void CalculateSalary();
  abstract   void DisplayInformation();
}
class Manager extends Employee{

    String post;
    int salary;
    String name;
    int age;
    String address;

    Manager(String Post,int Salary, String Name, int Age,String Address){
        this.post = Post;
        this.salary = Salary;
        this.name = Name;
        this.age = Age;
        this.address = Address;
    }
    void CalculateSalary(){
        System.out.println("My Post is :" + post);
        System.out.println("My Salary is :" + salary);
    }
    void DisplayInformation(){
        System.out.println("My Name is :" + name);
        System.out.println("My Age is: " + age);
        System.out.println("My Address is :" + address);
    }
}
class Programmer extends Employee{

    String post;
    int salary;
    String name;
    int age;
    String address;

    Programmer(String Post,int Salary, String Name, int Age,String Address){
        this.post = Post;
        this.salary = Salary;
        this.name = Name;
        this.age = Age;
        this.address = Address;
    }
    void CalculateSalary(){
        System.out.println("My Post is :" + post);
        System.out.println("My Salary is :"+ salary);
    }

    void DisplayInformation(){
        System.out.println("My Name is :" + name);
        System.out.println("My Age is :" + age);
        System.out.println("My Address is :" + address);
    }
    
}
public class EmployeeAbstract {
    public static void main(String[] args) {
        
        Manager m1 = new  Manager("Manager", 30000, "Pooja", 22, "Rahuri");
        m1.CalculateSalary();
        m1.DisplayInformation();

        Programmer p1 = new  Programmer("Devloper",6000,"Geeta",33,"loni");
        p1.CalculateSalary();
        p1.DisplayInformation();
    }
    
}
