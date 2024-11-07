package product;


public abstract class Product 
{
    private String name;
    private double price;
    private static final double TAX_RATE = 0.08;  

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public Product(String name) 
    {
        this.name = name;
        this.price = 0.0;  
    }

    public abstract void displayInfo();

    public double calculatePrice() 
    {
        return price + (price * TAX_RATE);
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    protected void setPrice(double price) 
    {
        this.price = price;
    }
}
