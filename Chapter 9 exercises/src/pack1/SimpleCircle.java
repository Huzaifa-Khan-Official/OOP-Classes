package pack1;

public class SimpleCircle {
    public double radius;

    public SimpleCircle() {
        this.radius = 1;
    }

    public SimpleCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRaius(double radius) {
        this.radius = radius;
    }
}
