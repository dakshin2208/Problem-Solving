package LldPractice.Model;

public class Product {
    int product_id;
    String name;
    String quantity;
    String description;
    private int autoIncrement = 0;

    public Product(String name , String quantity , String description){
        this.product_id = autoIncrement++;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }
    
}
