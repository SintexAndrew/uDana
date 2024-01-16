import com.codeborne.selenide.ElementsCollection;
import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Selenide.$$x;

public class Data{
    private static final String URL = "http://www.unity-dana.ru/books/book_new.php";

    public static String getURL() {
        return URL;
    }

    public static ElementsCollection hrefsArrayMainPage = $$x("//div[@class = 'list-catalog-sect']//a[@href]");

    public static ElementsCollection getHrefsArrayMainPage() {
        return hrefsArrayMainPage;
    }

    private static List<String> cleanHrefsList = new ArrayList<>();

    public static void setCleanHrefsList(List<String> cleanHrefsList) {
        Data.cleanHrefsList = cleanHrefsList;
    }

    public static List<String> getCleanHrefsList() {
        return cleanHrefsList;
    }

    private String bookName = "//h1";
    private String bookAuthor = "//ul[@class = 'description-books']//li[1]";
    private String bookICBN = "//ul[@class = 'description-books']//li[2]";

    private static ElementsCollection bookDescriptionElementsCollection = $$x("//div[@class = 'product-card-description']//p[2]");
    private String price = "//div[@class = 'product-block-price']//span"; // get text from locator

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookICBN() {
        return bookICBN;
    }

    public static ElementsCollection getBookDescriptionElementsCollection() {
        return bookDescriptionElementsCollection;
    }

    public String getPrice() {
        return price;
    }
}

