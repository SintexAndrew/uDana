import com.codeborne.selenide.ElementsCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logic {
    public static List<String> hrefsFromList(ElementsCollection elementsCollection) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < elementsCollection.size(); i++) {
            list.add(Data.getHrefsArrayMainPage()
                    .get(i)
                    .getAttribute("href"));
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String currentHref = iterator.next();
            String redundant1 = "javascript:;";
            String redundant2 = "http://www.unity-dana.ru/books/book_new.php#";
            if (currentHref.equals(redundant1) || currentHref.equals(redundant2)) {
                iterator.remove();
            }
        }
        Data.setCleanHrefsList(list);
        return list;
    }


    public static String getBookDescription() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Data.getBookDescriptionElementsCollection().size(); i++) {
            s.append(Data.getBookDescriptionElementsCollection().get(i).text());
        }
        return s.toString();
    }
}
