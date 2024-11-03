package assignmentsAbstarctClassesAndObject;

import java.util.*;

abstract class Product 
{
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    public abstract double getPrice();
    public abstract String getDescription();
    public int getQuantity()
    {
    	return quantity;
    }
}

class ElectronicsProduct extends Product 
{
    private String brand;
    private int warranty; 

    public ElectronicsProduct(String name, double price, String brand, int warranty,int quantity) 
    {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
        this.quantity=quantity;
    }

    public double getPrice() 
    {
        return quantity*price;
    }

    public String getDescription() 
    {
        return "Electronics: " + name + " by " + brand + " with " + warranty + " years warranty.\n";
    }
}

class ClothingProduct extends Product 
{
    private String size;
    private String color;

    public ClothingProduct(String name, double price, String size, String color,int quantity) 
    {
        super(name, price);
        this.size = size;
        this.color = color;
        this.quantity=quantity;
    }

    public double getPrice() 
    {
        return quantity*price;
    }

    public String getDescription() 
    {
        return "Clothing: " + name + ", Size: " + size + ", Color: " + color+"\n";
    }
}

class BookProduct extends Product 
{
    private String author;
    private int pages;

    public BookProduct(String name, double price, String author, int pages,int quantity) 
    {
        super(name, price);
        this.author = author;
        this.pages = pages;
        this.quantity=quantity;
    }

    public double getPrice() 
    {
        return quantity*price;
    }

    public String getDescription() 
    {
        return "Book: " + name + " by " + author + ", " + pages + " pages.\n";
    }
}

class ShoppingCart 
{
    private List<Product> products;

    public ShoppingCart() 
    {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) 
    {
        products.add(product);
    }

    public void displayCart() 
    {
        System.out.println("Shopping Cart Contents:");
        for (Product product : products) {
            System.out.println(product.getDescription() + " Quantity: "+product.getQuantity()+" - Price: Rs. " + product.getPrice());
            System.out.println();
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

public class ShoppingCartList 
{
    public static void main(String[] args) 
    {
        Product laptop = new ElectronicsProduct("Laptop", 1200, "Dell", 24,1);
        Product shirt = new ClothingProduct("T-shirt", 25, "M", "Blue",2);
        Product book = new BookProduct("Java Programming", 45, "James Gosling", 500,3);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(book);

        cart.displayCart();
        System.out.printf("Total Price: $%.2f\n", cart.calculateTotalPrice());
    }
}

/*
OUTPUT

Shopping Cart Contents:
Electronics: Laptop by Dell with 24 years warranty.
 Quantity: 1 - Price: Rs. 1200.0

Clothing: T-shirt, Size: M, Color: Blue
 Quantity: 2 - Price: Rs. 50.0

Book: Java Programming by James Gosling, 500 pages.
 Quantity: 3 - Price: Rs. 135.0

Total Price: $1385.00

*/
