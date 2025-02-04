class CarClass {
    String make;
    String model;
    int year;
    String color;

    public CarClass(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Color: " + color);
    }
    public static void main(String[] args) {
        CarClass myCar = new CarClass("Toyota", "Corolla", 2020, "Blue");
        myCar.displayDetails();
    }
}