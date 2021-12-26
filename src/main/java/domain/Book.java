package domain;

public class Book extends Product{
    private String author;

    public Book(int productId, String productName, int productPrice, String author) {
        super(productId, productName, productPrice);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

