
public class Rectangle extends Shape {

        // variable declaration
        double length;
        double width;

        // constructors
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // overriden methods
        @Override  
        double area() {
            return length * width;
        }


}