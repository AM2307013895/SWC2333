/* 
    File name   : Flower.java
    Programmer  : Hakim Musyamril
    ID          : AM2307013895
    Subject     : SWC2333
    Date        : 19 February 2024
*/

public class Flower {
    // Attributes
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    // Constructors
    public Flower() {
        this.name = "";
        this.color = "";
        this.price = 0.0;
        this.quantity = 0;
    }
    
    public Flower(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Accessor methods
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // toString method to display flower details
    @Override
    public String toString() {
        return "Flower [Name: " + name + "\t\tColor: " + color + "\tPrice: " + price + "\tQuantity: " + quantity + "]";
    }
}