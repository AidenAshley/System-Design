package user;

public class RegularCustomer implements Customer 
{
    private String name;

    public RegularCustomer(String name) 
    {
        this.name = name;
    }

    @Override
    public void placeOrder() 
    {
        System.out.println(name + " has placed a regular order.");
    }

    @Override
    public void addItemToCart(String item) 
    {
        System.out.println(name + " added " + item + " to the cart.");
    }

    public String getName() 
    
    {
        return name;
    }
}
