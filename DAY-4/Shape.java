class Shape {
    double length;
    double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length*width;
    }
    public double perimeter() {
        return 2 *(length + width);
    }
    public static void main(String args[]) {
        Shape rectangle1 = new Shape(5, 10);
        Shape rectangle2 = new Shape(10, 12);

        System.out.println("Perimeter of rectangle1 : " + rectangle1.perimeter());
        System.out.println("Perimeter of rectangle2 : " + rectangle2.perimeter());

        System.out.println("Area of rectangle1 : " + rectangle1.area());
        System.out.println("Area of rectangle2 : " + rectangle2.area());
    }
}
