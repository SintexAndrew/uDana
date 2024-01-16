import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class Info {
    @Test
    public void receiveInformation() {
        Selenide.open(Data.getURL());
        ElementsCollection elementsCollection = Data.hrefsArrayMainPage;
        Logic.hrefsFromList(elementsCollection);
        System.out.println(Data.getCleanHrefsList());
    }
}




