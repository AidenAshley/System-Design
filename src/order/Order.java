package order;

public abstract class Order 
{
    protected String orderID;
    protected double totalAmount;

    public Order(String orderID, double totalAmount) 
    {
        this.orderID = orderID;
        this.totalAmount = totalAmount;
    }

    public abstract void processOrder();

    public String getOrderID() 
    {
        return orderID;
    }

    public double getTotalAmount() 
    {
        return totalAmount;
    }
}
