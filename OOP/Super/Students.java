
public class Students extends Person {
    
    // variable declaration
    double gpa;

    // Student (String first, String last, double gpa) {
    //     this.first = first;
    //     this.last = last;
    //     this.gpa = gpa;
    // }

    /* this won't work because there is no parameterless constructor in Person.
    We are not able to assign these attributes of first and last within the constructor for Student , this is because student inherits from Person class and since the constructor of our parent requires first and last name , we have to pass these arguments to it's parent of Person.  */

    // constructor
    // so we do it this way using super keyword.
    Students (String first, String last, double gpa) {
        // this can be imagined/interpreted as if we are writing
        // Person(first, last);
        super(first, last);
        this.gpa = gpa;
    }

    // method
    void showGPA() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }


}