class Circle {
    double radius = 1;

    Circle() {
    }

    Circle(double newRadius) {
        this.radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }
}