package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage{

    public SelenideElement btnAddButton = $("button#addNewRecordButton");
    public SelenideElement txtFirstName = $("input#firstName");
    public SelenideElement txtLastName = $("input#lastName");
    public SelenideElement txtEmail = $("input#userEmail");
    public SelenideElement txtAge = $("input#age");
    public SelenideElement txtSalary = $("input#salary");
    public SelenideElement txtDepartment = $("input#department");
    public SelenideElement btnSubmit = $("button#submit");
    public SelenideElement btnEdit = $("span#edit-record-4");
    public SelenideElement txtCheckRecord = $(".rt-tbody .rt-tr-group:nth-child(4) .rt-td:nth-child(3)");

    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }

    public void addRecord(String firstname, String lastname, String email, int age, int salary, String department) {
        btnAddButton.click();
        txtFirstName.setValue(firstname);
        txtLastName.setValue(lastname);
        txtEmail.setValue(email);
        txtAge.setValue(String.valueOf(age));
        txtSalary.setValue(String.valueOf(salary));
        txtDepartment.setValue(department);
        btnSubmit.click();
    }

    public void changeAgeRecord(int age){
        btnEdit.click();
        txtAge.setValue(String.valueOf(age));
        btnSubmit.click();
    }

    public String getAgeRecord(){
        return txtCheckRecord.getText();
    }
}