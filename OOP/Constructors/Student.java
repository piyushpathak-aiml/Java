
public class Student {
    
    // variable declaration
    String name = "Jack";
    int age;
    double gpa;
    boolean isEnrolled;

    // constructors
    Student(String name, int age, double gpa) {

        // the keyword "this" is a keyword that refers to the current object.
        // the "." operator is used to access a member of the object, such as a variable or a method.
        
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
   }

    // methods
   void study() {

    // the keyword "this" is a keyword that refers to the current object.
    // for example if student2 is calling the method
    // then think as if in line 21 it is written 
    // studetn2.name instead of this.name
    System.out.println(this.name + " is studying.");
   }
}