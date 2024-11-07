package user;

public class PremiumCustomer implements Customer 
{
    private String name;

    public PremiumCustomer(String name) 
    {
        this.name = name;
    }

    @Override
    public void placeOrder() 
    {
        System.out.println(name + " has placed a premium order.");
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
