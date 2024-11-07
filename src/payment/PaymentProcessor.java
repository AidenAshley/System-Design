package payment;

public final class PaymentProcessor 
{

    private PaymentProcessor() {}  

    public static void processPayment(double amount) 
    {
        System.out.println("Processing payment of $" + amount);
    }
}
