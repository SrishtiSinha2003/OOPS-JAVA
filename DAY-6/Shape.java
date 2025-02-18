class Shape {
    public void find_Area() {
        System.out.println("Area cannot be determined");
    }
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        square.find_Area();
        rectangle.find_Area();
    }
}
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void find_Area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
class Rectangle extends Shape {
    private double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void find_Area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}


