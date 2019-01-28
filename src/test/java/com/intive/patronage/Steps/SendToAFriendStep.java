package com.intive.patronage.Steps;

import com.intive.patronage.DriverFactory;
import com.intive.patronage.pages.MainPage2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

public class SendToAFriendStep extends DriverFactory {
    MainPage2 mainPage2 = new MainPage2(driver);


    @Given("^User is on the main page in section Dresses$")
    public void userIsOnTheMainPageInSectionDresses() {
        mainPage2.openAutomationPage();
    }

    @When("^User clicks Dresses$")
    public void userClicksDresses() {
        mainPage2.clickDressesButton();
//        mainPage2.clickDressesButton();
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_category=8&controller=category"));
    }

    @And("^User clicks Evening Dresses$")
    public void userClicksEveningDresses() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(mainPage2.sfwithul));
        mainPage2.clicksEveningDresses();
        String actualURL = driver.getCurrentUrl();
        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_category=10&controller=category"));
    }

    @And("^User clicks a picture with a Printed Dress$")
    public void userClicksAPictureWithAPrintedDress() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(mainPage2.picture));
        mainPage2.focusOnThePicture();
//        Thread.sleep(5000);

//        String actualURL = driver.getCurrentUrl();
//        assertThat("User should be on Automation Practice page", actualURL.equals("http://automationpractice.com/index.php?id_product=4&controller=product"));
    }
    @And("^User clicks More$")
    public void userClicksMore() throws InterruptedException {
        mainPage2.userClicksMore();
//        Thread.sleep(5000);
//        mainPage2.clicksEveningDreseses();
//        String actualURL = driver.getCurrentUrl();
//        assertThat("User should be on Automation Practice page", actualURL.equals("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));


    }

    @And("^User clicks Send to a friend$")
    public void userClicksSendToAFriend() {
    }

    @And("^User enters Name of his/her friend Asia$")
    public void userEntersNameOfHisHerFriendAsia() {
    }

    @And("^User enters e-mail address of his/her friend asha7788@gmail.com$")
    public void userEntersEMailAddressOfHisHerFriendAshaGmailCom(int arg0) {
    }

    @And("^User clicks Send button$")
    public void userClicksSendButton() {
    }

    @Then("^User should see the confirmation on the Website$")
    public void userShouldSeeTheConfirmationOnTheWebsite() {

    }

    }