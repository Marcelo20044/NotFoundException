package domain;

public class Book extends Product{
    private String title;
    public String author;

    public Book(int productId, String productName, int productPrice, String title, String author) {
        super(productId, productName, productPrice);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

