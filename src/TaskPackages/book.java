package TaskPackages;

public class book {
    private String title;
    private String author;
    private double price;

    public book(String author, double price, String title) {
        this.author = author;
        this.price = price;
        this.title = title;
        System.out.println("Author:"+author+"\nTitle:"+title+"\nPrice:"+price);
    }


    public static void main(String[] args) {
        book bk= new book("Dr Shankar",300.00,"the early tales");

    }
}
