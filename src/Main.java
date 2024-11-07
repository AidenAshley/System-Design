
import order.InStoreOrder;
import order.OnlineOrder;
import payment.PaymentProcessor;
import payment.ShippingCalculator;
import product.Book;
import product.Electronics;
import user.PremiumCustomer;
import user.RegularCustomer;

public class Main {
    public static void main(String[] args) 
    {
        
        Book book = new Book("Animal Farm", 15.99, "George Orwell");
        Electronics phone = new Electronics("iPhone 14", 999.99, "Apple");

        book.displayInfo();  
        phone.displayInfo(); 

        PremiumCustomer premiumCustomer = new PremiumCustomer("Alice");
        RegularCustomer regularCustomer = new RegularCustomer("Bob");

        premiumCustomer.addItemToCart(book.getName());
        regularCustomer.addItemToCart(phone.getName());

        premiumCustomer.placeOrder();
        regularCustomer.placeOrder();

        OnlineOrder onlineOrder = new OnlineOrder("OO4652", book.calculatePrice() + ShippingCalculator.calculateShipping(book.getPrice()), "123 Street Name");
        InStoreOrder inStoreOrder = new InStoreOrder("AA12345", phone.calculatePrice(), "Downtown Store");

        onlineOrder.processOrder();
        inStoreOrder.processOrder();

        PaymentProcessor.processPayment(onlineOrder.getTotalAmount());
        PaymentProcessor.processPayment(inStoreOrder.getTotalAmount());

        double shippingCost = ShippingCalculator.calculateShipping(inStoreOrder.getTotalAmount());
        System.out.println("Shipping cost for in-store order: $" + shippingCost);
    }
}