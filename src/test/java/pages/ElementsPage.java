package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage extends BasePage{

    public SelenideElement btnButton = $("div.show li:nth-child(5) span.text");
    public SelenideElement btnClickMe = $("div[class*='col-md-6'] div:nth-child(2) div:last-child button.btn-primary");
    public SelenideElement msgResultMessage = $("#dynamicClickMessage");

    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }
    public String getClickMessage(){
        return msgResultMessage.getText();
    }
}