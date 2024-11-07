package product;

public class Electronics extends Product 
{
    private String brand;

    public Electronics(String name, double price, String brand) 
    {
        super(name, price);
        this.brand = brand;
    }

    public Electronics(String name, String brand) 
    {
        super(name);
        this.brand = brand;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Electronics: " + getName() + " by " + brand + ", Price: $" + getPrice());
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }
}
