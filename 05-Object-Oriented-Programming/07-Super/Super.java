
public class Super {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        // used in constructors and method overwriting
        // calls the parent constructor to initialize attributes

        // object
        Person person = new Person ("Tom", "Riddle");
        Students student = new Students ("Harry", "Potter", 3.1);
        Employee employee = new Employee ("Rubeus", "Hagrid", 50000);

        // calling methods
        person.showName();
        student.showGPA();
        employee.showSalary();

    }
}