package order;


public class OnlineOrder extends Order 
{
    private String deliveryAddress;

    public OnlineOrder(String orderID, double totalAmount, String deliveryAddress) 
    {
        super(orderID, totalAmount);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processOrder() 
    {
        System.out.println("Processing online order " + orderID + " with total amount: $" + totalAmount + " to " + deliveryAddress);
    }

    public String getDeliveryAddress() 
    {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) 
    {
        this.deliveryAddress = deliveryAddress;
    }
}

