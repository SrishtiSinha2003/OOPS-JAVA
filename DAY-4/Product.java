class Product{
    String productName;
    int productId;
    double productPrice;
    int quantityInStock;

    public Product(String productName, int productID, double productPrice, int quantityInStock){
        this.productName = productName;
        this.productId = productID;
        this.productPrice = productPrice;
        this.quantityInStock = quantityInStock;
    }
    public void discount(double discountPercent) {
        productPrice -= productPrice * (discountPercent / 100);
    }
}