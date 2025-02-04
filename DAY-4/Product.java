import java.util.ArrayList;

class Product {
    String productName;
    int productId;
    double productPrice;
    int quantityInStock;

    public Product(String productName, int productID, double productPrice, int quantityInStock) {
        this.productName = productName;
        this.productId = productID;
        this.productPrice = productPrice;
        this.quantityInStock = quantityInStock;
    }

    public void discount(double discountPercent) {
        productPrice -= productPrice * (discountPercent / 100);
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Product ID: " + productId + ", Price: " + productPrice + ", Quantity in Stock: " + quantityInStock);
    }
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 101, 50000, 10));
        productList.add(new Product("Smartphone", 102, 20000, 50));
        productList.add(new Product("Headphones", 103, 1500, 100));

        for (Product product : productList) {
            product.discount(10); 
        }
        for (Product product : productList) {
            product.displayProductDetails();
        }
    }
}


