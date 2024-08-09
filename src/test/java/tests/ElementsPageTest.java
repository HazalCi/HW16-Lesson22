package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }

    @Test
    public void clickButtonTest(){
        pageManager.elementsPage.btnButton.click();
        pageManager.elementsPage.btnClickMe.click();
        assertThat(pageManager.elementsPage.getClickMessage()).isEqualTo("You have done a dynamic click");
    }
}