package librarymanagement;

public class Book {
    private long id;
    private String name;
    private String author;
    private String content;
    private double price;

    public Book() {
    }

    public Book(long id, String name, String author, String content, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.content = content;
        this.price = price;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrice(double price) { this.price = price; }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public double getPrice() { return price; }

    public String showBook(long id) {
        return "Book Details " +
                "\nid='" + id + '\'' +
                "\nname='" + name + '\'' +
                "\nauthor='" + author + '\'' +
                "\ncontent='" + content + '\''+
                "\nprice='" + price + '\'';
    }
}
