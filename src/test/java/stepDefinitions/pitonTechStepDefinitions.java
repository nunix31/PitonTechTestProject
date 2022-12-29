package stepDefinitions;

import Pages.pitonTechnologyPage;
import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class pitonTechStepDefinitions {
    WebDriver driver = Driver.getDriver();
    pitonTechnologyPage page = new pitonTechnologyPage();
    Actions action = new Actions(Driver.getDriver());
    String username = "automationtest";
    Faker faker = new Faker();

    @Given("User goes to pitonTest url address.")
    public void userGoesToPitonTestUrlAddress() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("User verifies the login form.")
    public void userVerifiesTheLogin() {
        ReusableMethods.waitForVisibility(page.loginText, 2);
        Assert.assertTrue(page.loginText.isDisplayed());
        System.out.println("Login form text verified.");
    }


    @And("User verifies username button.")
    public void userVerifiesUsernameButton() {
        ReusableMethods.waitForVisibility(page.userNameBox, 2);
        Assert.assertTrue(page.userNameBox.isDisplayed());
        System.out.println("User name box verified.");
    }

    @And("User verifies password button.")
    public void userVerifiesPasswordButton() {
        ReusableMethods.waitForVisibility(page.passwordBox, 2);
        Assert.assertTrue(page.passwordBox.isDisplayed());
        System.out.println("Password box verified.");
    }

    @And("User verifies login button.")
    public void userVerifiesLoginButton() {
        ReusableMethods.waitForVisibility(page.loginButton, 2);
        Assert.assertTrue(page.loginButton.isDisplayed());
        System.out.println("Login button verified.");
    }

    @And("User clicks the login button.")
    public void userClicksTheLoginButton() {
         /* ReusableMethods.waitForVisibility
                (driver.findElement(By.xpath
                        ("(//span[@class='mat-button-wrapper' and normalize-space()='Login'])")), 2);
        driver.findElement(By.xpath
                ("(//span[@class='mat-button-wrapper' and normalize-space()='Login'])")).click(); */
        page.loginButton.click();
    }

    @And("User waits {int} seconds.")
    public void userWaitsSeconds(int waitTime) {
        ReusableMethods.waitFor(waitTime);
    }

    @And("User sees the username error if click the login button without fill the login form.")
    public void userSeesTheUsernameErrorIfClickTheLoginButtonWithoutFillTheLoginForm() {
        ReusableMethods.waitForVisibility(page.userNameAlert, 2);
        Assert.assertTrue(page.userNameAlert.isDisplayed());
        System.out.println("Login failed error checked when username box is empty.");
    }

    @And("User sees the password error if click the login button without fill the login form.")
    public void userSeesThePasswordErrorIfClickTheLoginButtonWithoutFillTheLoginForm() {
        ReusableMethods.waitForVisibility(page.passwordAlert, 2);
        Assert.assertTrue(page.passwordAlert.isDisplayed());
        System.out.println("Login failed error checked when password box is empty.");
    }

    @And("User enters the user name information.")
    public void userEntersTheUserNameInformation() {
        ReusableMethods.waitForVisibility(page.userNameBox, 2);
        page.userNameBox.sendKeys(username);
        System.out.println("User name information was entered to user name box.");
    }

    @And("User enters the password information.")
    public void userEntersThePasswordInformation() {
        System.out.println("Password information was entered to password box.");
        action.sendKeys(Keys.TAB).sendKeys("123456789").perform();
    }

    @And("User navigates to the dashboard and sees the welcome message.")
    public void userNavigatesToTheDashboardAndSeesTheWelcomeMessage() {
        ReusableMethods.waitForVisibility(page.welcomeMessage, 2);
        System.out.println("Welcome message verified.");
        Assert.assertTrue(page.welcomeMessage.isDisplayed());
    }

    @And("User clicks the Create Event button.")
    public void userClicksTheCreateEventButton() {
        page.createEventButton.click();
    }

    @And("User views create event form when clicks the create event button on dashboard.")
    public void userViewsCreateEventFormWhenClicksTheCreateEventButtonOnDashboard() {
        Assert.assertTrue(page.createEventText.isDisplayed());
    }

    @And("User clicks the Create New Event button.")
    public void userClicksTheCreateNewEventButton() {
        ReusableMethods.waitForVisibility(page.createNewEventButton, 2);
        page.createNewEventButton.click();
    }

    @And("User views validation error of event name.")
    public void userViewsValidationErrorOfEventName() {
        Assert.assertTrue(page.eventNameAlert.isDisplayed());
        System.out.println("Validation error of event name verified.");
    }

    @And("User views validation error of valid date.")
    public void userViewsValidationErrorOfValidDate() {
        Assert.assertTrue(page.validDateAlert.isDisplayed());
        System.out.println("Validation error of valid date verified.");
    }

    @And("User views validation error of participant first name.")
    public void userViewsValidationErrorOfParticipantFirstName() {
        Assert.assertTrue(page.firstNameAlert.isDisplayed());
        System.out.println("Validation error of participant first name verified.");
    }

    @And("User views validation error of participant last name.")
    public void userViewsValidationErrorOfParticipantLastName() {
        Assert.assertTrue(page.lastNameAlert.isDisplayed());
        System.out.println("Validation error of last name verified.");
    }

    @And("User views validation error of email or phone number.")
    public void userViewsValidationErrorOfEmailOrPhoneNumber() {
        Assert.assertTrue(page.contactAlert.isDisplayed());
        System.out.println("Validation error of contact verified.");
    }

    @And("User verifies able to add new participant when click the add participant button.")
    public void userVerifiesAbleToAddNewParticipantWhenClickTheAddParticipantButton() {
        ReusableMethods.waitForVisibility(page.addParticipantButton, 3);
        page.addParticipantButton.click();
        Assert.assertTrue(page.secondParticipant.isDisplayed());
        System.out.println("Adding new participant when click the add participant button verified.");
    }

    @And("User clicks the delete button.")
    public void userClicksTheDeleteButton() {
        page.deleteButton.click();
    }

    @And("User views error message when removes all participants.")
    public void userViewsErrorMessageWhenRemovesAllParticipants() {
        Assert.assertTrue(page.addParticipantAlert.isDisplayed());
        System.out.println("Error message verified when removes all participants.");
    }

    @And("User enters a event name in event name box.")
    public void userEntersAEventNameInEventNameBox() {
        ReusableMethods.waitForVisibility(page.eventNameBox, 4);
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys(faker.superhero().name());
    }

    @And("User enters a event description in event description box.")
    public void userEntersAEventDescriptionInEventDescriptionBox() {
        ReusableMethods.waitForVisibility(page.eventDescriptionBox, 4);
        driver.findElement(By.xpath("//*[@id='description']")).sendKeys(faker.superhero().descriptor());
    }

    @And("User enters a event date in event date box.")
    public void userEntersAEventDateInEventDateBox() {
        page.calendarButton.click();
        page.calendarNextButton.click();
        driver.findElement(By.xpath("(//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[24]")).click();

    }

    @And("User enters a first name in first name box.")
    public void userEntersAFirstNameInFirstNameBox() {
        ReusableMethods.waitForVisibility(page.firstNameBox, 4);
        page.firstNameBox.sendKeys(faker.name().firstName());
    }

    @And("User enters a last name in last name box.")
    public void userEntersALastNameInLastNameBox() {
        page.lastNameBox.sendKeys(faker.name().lastName());
    }

    @And("User enters a phone number in contact box.")
    public void userEntersAPhoneNumberInContactBox() {
        page.contactBox.sendKeys(faker.phoneNumber().phoneNumber());
    }

    @And("User verifies the successful message.")
    public void userVerifiesTheSuccessfulMessage() {
        page.succesfullMesage.isDisplayed();
        System.out.println("Event created succesfully message verified.");
    }

    @And("User clicks the Edit Event button.")
    public void userClicksTheEditEventButton() {
        page.editEventButton.click();
    }

    @And("User edits all event fields.")
    public void userEditsAllEventFields() {
        page.eventNameBox.clear();
        page.eventNameBox.sendKeys(faker.superhero().name());
        page.eventDescriptionBox.clear();
        page.eventDescriptionBox.sendKeys(faker.superhero().descriptor());
        page.calendarButton.click();
        page.calendarNextButton.click();
        driver.findElement(By.xpath("(//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[13]")).click();
        page.firstNameBoxEdit.clear();
        page.firstNameBoxEdit.sendKeys(faker.name().firstName());
        page.lastNameBoxEdit.clear();
        page.lastNameBoxEdit.sendKeys(faker.name().firstName());
        page.contactBoxEdit.clear();
        page.contactBoxEdit.sendKeys(faker.internet().emailAddress());
        System.out.println("User edited all event fields.");

    }

    @And("User verifies the Event updated succesfully alert.")
    public void userVerifiesTheEventUpdatedSuccesfullyAlert() {
        page.updateEventButton.click();
        Assert.assertTrue(page.eventUpdatedMessage.isDisplayed());
        ReusableMethods.waitFor(3);
        System.out.println("Event updated succesfully alert verified.");
    }

    @And("Authenticated user verifies dashboard.")
    public void authenticatedUserVerifiesDashboard() {
        Assert.assertTrue(page.eventsText.isDisplayed());
        System.out.println("Dashboard verified.");
    }

    @Given("Not authenticated user goes to pitonTest for redirects to login page.")
    public void notAuthenticatedUserGoesToPitonTestForRedirectsToLoginPage() {
       page.userNameBox.sendKeys("automationtest");
       page.passwordBox2.sendKeys("123456");
       page.loginButton.click();
    }

    @And("User verifies that they are redirected to the login page.")
    public void userVerifiesThatTheyAreRedirectedToTheLoginPage() {
        Assert.assertTrue(page.loginText.isDisplayed());
        System.out.println("Redirecting to login page from dashboard verified.");
    }

    @And("User verifies list of created events.")
    public void userVerifiesListOfCreatedEvents() {
      Assert.assertTrue(page.eventNameText.isDisplayed());
        System.out.println("List of created events verified.");
    }

    @And("User deletes the event.")
    public void userDeletesTheEvent() {
        page.deleteEventButton.click();
    }

    @And("User verifies no registered event has been found alert.")
    public void userVerifiesNoRegisteredEventHasBeenFoundAlert() {
        Assert.assertTrue(page.notEventFoundText.isDisplayed());
        System.out.println("No registered event has been found alert verified.");
    }

    @And("User navigates in edit event page.")
    public void userNavigatesInEditEventPage() {
        page.eventNameBox.click();
        ReusableMethods.waitFor(1);
        page.eventDescriptionBox.click();
        ReusableMethods.waitFor(1);
        page.calendarButton.click();
        driver.findElement(By.xpath("(//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[24]")).click();
        ReusableMethods.waitFor(1);
        page.firstNameBoxEdit.click();
        ReusableMethods.waitFor(1);
        page.lastNameBoxEdit.click();
        ReusableMethods.waitFor(1);
        page.contactBoxEdit.click();
        ReusableMethods.waitFor(1);
        System.out.println("Navigating int edit event page verified.");
    }

    @And("User clicks the delete event button.")
    public void userClicksTheDeleteEventButton() {
        page.deleteEventButton.click();
    }

    @And("User views event participants.")
    public void userViewsEventParticipants() {
        page.participantsButton.click();
        Assert.assertTrue(page.participantsList.isDisplayed());
        System.out.println("Event participants verified.");
    }
}
