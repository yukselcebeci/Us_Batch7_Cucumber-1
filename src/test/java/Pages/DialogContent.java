package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),' LOGIN ')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button[@class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement nameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement countryCodeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private List<WebElement> deleteCountryButtonList;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteButton;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement citizenshipShortName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    private WebElement citizenShipShortNameSearch;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement integrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement priorityInput;

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getNameSearch() {
        return nameSearch;
    }

    public WebElement getCountryCodeSearch() {
        return countryCodeSearch;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public List<WebElement> getDeleteCountryButtonList() {
        return deleteCountryButtonList;
    }

    public WebElement getCitizenshipShortName() {
        return citizenshipShortName;
    }

    public WebElement getCitizenShipShortNameSearch() {
        return citizenShipShortNameSearch;
    }

    public WebElement getIntegrationCode() {
        return integrationCode;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }
}
