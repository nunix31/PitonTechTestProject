package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class pitonTechnologyPage {

    public pitonTechnologyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='login-header']")
    public WebElement loginText;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c37-1' and normalize-space()='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy (xpath = "//mat-error[@id='mat-error-0' and normalize-space()='Username field is required']")
    public WebElement userNameAlert;

    @FindBy (xpath = "//mat-error[@id='mat-error-1' and normalize-space()='Password field is required']")
    public WebElement passwordAlert;

    @FindBy(xpath = "//span[.='Create Event']")
    public WebElement createEventButton;

    @FindBy (xpath = "//*[text()='Welcome Automation Test User']")
    public WebElement welcomeMessage;

    @FindBy (xpath = "//*[text()='Create Event']")
    public WebElement createEventText;

    @FindBy (xpath = "//*[text()='Create New Event']")
    public WebElement createNewEventButton;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/app-create-event[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[3]/div[1]/mat-error[1]")
    public WebElement eventNameAlert;

    @FindBy (xpath = "//*[@class='mat-error ng-tns-c37-2']")
    public WebElement validDateAlert;

    @FindBy (xpath = "//*[@id='mat-error-2']")
    public WebElement firstNameAlert;

    @FindBy (xpath = "//*[@class='mat-error ng-tns-c37-4']")
    public WebElement lastNameAlert;

    @FindBy (xpath = "//*[@class='mat-error ng-tns-c37-5']")
    public WebElement contactAlert;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper' and normalize-space()='Add Participant'])")
    public WebElement addParticipantButton;

    @FindBy (xpath = "(//*[@class='ng-star-inserted'])[3]")
    public WebElement secondParticipant;

    @FindBy (xpath = "//*[@class='mat-icon notranslate material-icons mat-icon-no-color']")
    public WebElement deleteButton;

    @FindBy (xpath = "(//*[@class='ng-star-inserted'])[2]")
    public WebElement addParticipantAlert;

    @FindBy (xpath = "//*[@id='name']")
    public WebElement eventNameBox;

    @FindBy (xpath = "//*[@id='description']")
    public WebElement eventDescriptionBox;

    @FindBy(css = "input#mat-input-5")
    public WebElement firstNameBox;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/app-edit-event[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement firstNameBoxEdit;

    @FindBy(css = "input#mat-input-6")
    public WebElement lastNameBox;

    @FindBy (xpath = "//*[text()='Event created successfully']")
    public WebElement succesfullMesage;

    @FindBy (css = "input#mat-input-7")
    public WebElement contactBox;

    @FindBy (xpath = "//*[name()='path' and contains(@d,'M19 3h-1V1')]")
    public WebElement calendarButton;

    @FindBy (xpath = "//*[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']")
    public WebElement calendarNextButton;

    @FindBy (xpath = "//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[24]")
    public WebElement date24;

    @FindBy (xpath = "(//*[@class='mat-icon notranslate material-icons mat-icon-no-color'])[1]")
    public WebElement editEventButton;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper' and normalize-space()='Update Event'])")
    public WebElement updateEventButton;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/app-edit-event[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement lastNameBoxEdit;

    @FindBy (xpath = "/html[1]/body[1]/app-root[1]/app-edit-event[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement contactBoxEdit;

    @FindBy (xpath = "//*[text()='Event updated successfully']")
    public WebElement eventUpdatedMessage;

    @FindBy (xpath = "//*[text()='Events']")
    public WebElement eventsText;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement passwordBox2;

    @FindBy (xpath = "//*[text()=' Name']")
    public WebElement eventNameText;

    @FindBy (xpath = "//*[text()='delete']")
    public WebElement deleteEventButton;

    @FindBy (xpath = "//*[@class='mat-card-content']")
    public WebElement notEventFoundText;

    @FindBy (xpath = "//*[text()='supervised_user_circle']")
    public WebElement participantsButton;

    @FindBy (xpath = "//*[@class='mat-dialog-title']")
    public WebElement participantsList;

}
