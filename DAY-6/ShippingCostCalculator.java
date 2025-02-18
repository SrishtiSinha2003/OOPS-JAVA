import java.util.Scanner;
class Box {
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); 
        this.weight = weight;
    }
    double calculateShippingCost(double distance, double costPerKm) {
        double vol = volume();  
        return distance * vol * costPerKm; 
    }
}
public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the box: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the box: ");
        double height = sc.nextDouble();
        System.out.print("Enter the depth of the box: ");
        double depth = sc.nextDouble();
        System.out.print("Enter the weight of the box: ");
        double weight = sc.nextDouble();
        System.out.print("Enter the distance to ship in km: ");
        double distance = sc.nextDouble();
        System.out.print("Enter the cost per km: ");
        double costPerKm = sc.nextDouble();
        BoxWeight box = new BoxWeight(width, height, depth, weight);
        double volume = box.volume();
        System.out.println("The volume of the box is: " + volume);
        double shippingCost = box.calculateShippingCost(distance, costPerKm);
        System.out.println("The cost to ship the box is: " + shippingCost);

        sc.close();
    }
}
