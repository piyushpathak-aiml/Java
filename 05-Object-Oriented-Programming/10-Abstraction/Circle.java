
public class Circle extends Shape {

        // variable declaration
        double radius;

        // constructors
        Circle(double radius) {
            this.radius = radius;
        }

        // overriden methods
        @Override
        double area() {

            return Math.PI * Math.pow(this.radius, 2);
        }


}