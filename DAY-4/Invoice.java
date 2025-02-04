class InvoiceItem {
    String id;
    String description;
    int quantity;
    double unitPrice;

    InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    double applyDiscount(double discountPercentage) {
        double totalPrice = quantity * unitPrice;
        double discountAmount = totalPrice * (discountPercentage / 100);
        return totalPrice - discountAmount;
    }
    void displayInvoice(double discountPercentage) {
        System.out.println("Invoice ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total after " + discountPercentage + "% discount: " + applyDiscount(discountPercentage));
    }
}

class Main {
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("123", "Laptop", 2, 50000);

        item.displayInvoice(10); 
    }
}

