class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Circumference of the circle: " + circle.circumference());
    }
}

