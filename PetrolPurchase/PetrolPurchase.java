public class PetrolPurchase {
    private String location;
    private String type;
    private int quantity;
    private double price;
    private double discount;    //Setting instance variables
    
    public PetrolPurchase (String location, String type, int quantity, double price, double discount) {
        this.location = location;
        this.type = type;
        
        if(quantity > 0) {
            this.quantity = quantity;
        }
        
        if (price > 0.0) {
            this.price = price;
        }
        
        if (discount > 0.0) {
            this.price = price;
        }
        
        if (discount > 0.0) {
            this.discount = discount;
        }
        
    }   //Giving values of instance variables
    
    public void setLocation() {
        this.location = location;
    }
    
    public void setType() {
        this.type = type;
    }
    
    public void setQuantity() {
        if (quantity > 0.0) {
            this.quantity = quantity;
        }
    }
    
    public void setPrice() {
        if (price > 0.0) {
            this.price = price;
        }
    }   //Giving set public classes for each variable
    
    public void setDiscount() {
        this.discount = discount;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getType() {
        return type;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getDiscount() {
        return discount;
    }   //Giving get public classes for each variable
    
    public double getPurchaseAmount() {
        double purchaseAmount = (price * quantity) - discount;
        return purchaseAmount;
    }
}
