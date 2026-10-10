
public class Constructors {
    public static void main(String[] args) {

        // object
        Student student1 = new Student("Jack", 30, 3.2);
        Student student2 = new Student("Michael", 34, 1.5);

        // display output
        // the output is same name for both student objects, before constructor
        // the issue is that both of the students here are having the same name
        // we can fix that with the help of a constructor
        System.out.println("******************************");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student2.isEnrolled);
        System.out.println("******************************");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        System.out.println("******************************");

        // let's create another student object
        Student student3 = new Student("Nick", 27, 4.0);

        // display output
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        System.out.println("******************************");

        // calling study method
        student1.study();
        student2.study();
        student3.study();
    }
}