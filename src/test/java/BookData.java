public class BookData {
    private String name;
    private String author;
    private String ISBN;
    private String description;
    private String price;

    public BookData(String name, String author, String ISBN, String description, String price) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookData{" +
                "name='" + name + '\'' +
                ", Автор='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Описание='" + description + '\'' +
                ", Цена='" + price + '\'' +
                '}';
    }

}
