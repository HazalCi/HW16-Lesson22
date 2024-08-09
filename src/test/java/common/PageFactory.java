package common;

import pages.ElementsPage;
import pages.WebTablesPage;

public class PageFactory {

    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage("/webtables");
    }

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }

}