package order;



public class InStoreOrder extends Order 
{
    private String storeLocation;

    public InStoreOrder(String orderID, double totalAmount, String storeLocation) 
    {
        super(orderID, totalAmount);
        this.storeLocation = storeLocation;
    }

    @Override
    public void processOrder() 
    {
        System.out.println("Processing in-store order " + orderID + " with total amount: $" + totalAmount + " at " + storeLocation);
    }

    public String getStoreLocation() 
    {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) 
    {
        this.storeLocation = storeLocation;
    }
}
