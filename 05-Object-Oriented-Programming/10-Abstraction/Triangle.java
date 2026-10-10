
public class Triangle extends Shape {

        // variable declaration
        double base;
        double height;

        // constructors
        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        // overriden methods
        @Override  
        double area() {
            return 0.5 * base * height;
        }

}