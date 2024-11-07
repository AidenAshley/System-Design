package product;


public class Book extends Product 
{
    private String author;

    public Book(String name, double price, String author) 
    {
        super(name, price);
        this.author = author;
    }

    public Book(String name, String author) 
    {
        super(name);
        this.author = author;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Book: " + getName() + " by " + author + ", Price: $" + getPrice());
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String author) 
    {
        this.author = author;
    }
}
