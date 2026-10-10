
public class Employee extends Person {

    // variable declaration
    int salary;

    // constructor
    Employee (String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    // method
    void showSalary () {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
    
}