package common;

import driver.DriverFactory;
import pages.ElementsPage;
import pages.WebTablesPage;

public class PageManager {
    public WebTablesPage webTablesPage;
    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablesPage = PageFactory.buildWebTablesPage();
        elementsPage = PageFactory.buildElementsPage();

    }
}