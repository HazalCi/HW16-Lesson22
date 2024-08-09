package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.webTablesPage.open();
    }

    @Test
    public void recordCheckTest(){
        pageManager.webTablesPage.addRecord("Hazal","Cigerim","hazalcigerim@gmail.com",25,1000,"R&D");
        pageManager.webTablesPage.changeAgeRecord(27);
        assertThat(pageManager.webTablesPage.getAgeRecord()).isEqualTo("27");
    }

}