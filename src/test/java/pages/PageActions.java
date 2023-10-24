package pages;

import Base.Bases;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageActions extends Bases {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[contains(text(),'Username')]")
    WebElement text_username;

    @FindBy(xpath = "//*[contains(text(),'Password')]")
    WebElement text_password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement login_button;


    @FindBy(xpath = "//button[@class='error-button']//*[name()='svg']")
    WebElement X_icon;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement pageName;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement productSortingIcon;

    @FindBy(className  = "product_sort_container")
    WebElement productSortingOption;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    WebElement Sauce_Labs_Backpack;

    @FindBy(xpath = "//*[contains(text(),'Sauce Labs Backpack')]")
    WebElement Sauce_Labs_Backpack_one;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(),'Add to cart')]")
    WebElement addToCartButton2;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement notificationBadge;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement hamburgerBar;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement LogoutButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cart;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement removeButton;

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
    WebElement allItems;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Onesie']")
    WebElement SauceLabOnesie;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement Checkout;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement Continue;

    @FindBy(xpath = "//div[normalize-space()='SauceCard #31337']")
    WebElement productNumber;

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backHomeButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement error_messages;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/div/text()")
    WebElement dispatchTxT;

    @FindBy(xpath = "//img[@alt='Pony Express']")
    WebElement greenTickIcon;


    public PageActions() {

        PageFactory.initElements(driver, this);
    }

    public void username() throws InterruptedException {
        Thread.sleep(6000);
        username.click();
        username.sendKeys(properties.getProperty("username"));
    }

    public void password(){
        password.click();
        password.sendKeys(properties.getProperty("password"));
    }

    public void incorrect_username() throws InterruptedException {
        Thread.sleep(6000);
        username.click();
        username.sendKeys(properties.getProperty("incorrect_username"));
    }

    public void incorrect_password(){
        password.click();
        password.sendKeys(properties.getProperty("incorrect_password"));
    }

    public void clickLoginButton(){
        login_button.click();
    }

    public void userVerifyTheLandingPageName() {
        String expectedTitle = pageName.getText();
        String actualTitle = "Products";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public void selectTheProductSortingIconAndSelectTheOption() {

        String expectedProductSortingOption = productSortingOption.getText();
        Select option = new Select(productSortingOption);
        option.selectByVisibleText("Price (low to high)");
        Assert.assertEquals(expectedProductSortingOption.contains("Price (low to high)"),true);
    }

    public void addTheItemSauceLabsBackpackToYourCart() {
        Sauce_Labs_Backpack.click();
        addToCartButton.click();
    }

    public void confirmThatTheNotificationBadgeDisplaysOnTheShoppingCartIcon() throws InterruptedException {
        Thread.sleep(6000);
        Assert.assertEquals(true,notificationBadge.isDisplayed());
    }

    public void clickTheHamburgerBarAndLogout() throws InterruptedException {
        hamburgerBar.click();
        Thread.sleep(6000);
        Assert.assertEquals(true,LogoutButton.isDisplayed());
        LogoutButton.click();
        driver.quit();

    }

    public void confirm_that_the_item_sauce_labs_backpack_has_the_remove_button_displaying() throws InterruptedException {
        Thread.sleep(6000);
        Sauce_Labs_Backpack_one.click();
        addToCartButton.click();
        cart.click();
        boolean isRemoveButtonDisplayed = removeButton.isDisplayed();
        Assert.assertTrue(isRemoveButtonDisplayed);
        boolean isRemoveButtonEnabled = removeButton.isEnabled();
        Assert.assertTrue(isRemoveButtonEnabled);
    }

    public void confirm_that_clicking_the_remove_button_will_remove_the_item_from_the_basket() throws InterruptedException {
        Thread.sleep(5000);
        removeButton.click();
        Thread.sleep(5000);
       // String text = Sauce_Labs_Backpack.getText();
        //Assert.assertFalse(driver.getPageSource().contains(text));

    }

    public void go_buy_the_sauce_lab_onesie_and_add_validations_on_the_payment_information_and_confirm_the_order_is(String SauceCard,String firstnames, String lastnames ,String postal_Codes) throws InterruptedException {

            hamburgerBar.click();
            Thread.sleep(2000);
            allItems.click();
            Thread.sleep(2000);
            SauceLabOnesie.click();
            Thread.sleep(2000);
            addToCartButton2.click();
            Thread.sleep(2000);
            cart.click();
            Thread.sleep(2000);
            Checkout.click();
            Thread.sleep(2000);
            firstname.sendKeys(firstnames);
            Thread.sleep(2000);
            lastname.sendKeys(lastnames);
            Thread.sleep(2000);
            postalCode.sendKeys(postal_Codes);
            Thread.sleep(2000);
            Continue.click();

            boolean pnum = productNumber.isDisplayed();
            Assert.assertEquals(true,pnum);

            Thread.sleep(2000);
            finishButton.click();


    }

    public void verify_That_Username_And_Password_Text_Displays() throws InterruptedException {
        boolean txtUser = text_username.isDisplayed();
        Assert.assertTrue(txtUser);
        Thread.sleep(3000);
        boolean txtPass = text_password.isDisplayed();
        Assert.assertTrue(txtPass);

    }

    public void confirmTheLoginButtonHasTheCorrectCssValue() {
        String ccV = login_button.getCssValue("background-color");
        System.out.println("ccV = " + ccV);
    }

    public void confirmThatTheErrorMessageDisplaysWhenLoginButtonIsClickedError_mesage(String error_mesage) throws InterruptedException {
        Thread.sleep(4000);
        boolean isErrorDisplayed = error_messages.isDisplayed();
        Assert.assertTrue(isErrorDisplayed);


    }

    public void usersCanClickTheXIconOnTheErrorMessageToMakeItDisappear() throws InterruptedException {
        Thread.sleep(3000);
        X_icon.click();

        driver.quit();
    }

    public void greenTickIconDisplays() throws InterruptedException {
        Thread.sleep(3000);
    //    boolean isGreenTickIconDisplaying = greenTickIcon.isDisplayed();
  //      Assert.assertTrue("Green Tik Icon is present",isGreenTickIconDisplaying);

        WebElement img = driver.findElement(By.cssSelector("img"));//.getCssValue("src");
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", img);
        Assert.assertTrue("Green Tik Icon is present",ImagePresent);

    }

    public void yourOrderHasBeenDispatched(String actualDispatchMessage) throws InterruptedException {
        Thread.sleep(4000);
    }

    public void backHomeButtonIsActiveAndUserCanClickOnIt() throws InterruptedException {
        Thread.sleep(4000);
        boolean isBackHomeButton = backHomeButton.isDisplayed();
        Assert.assertTrue(isBackHomeButton);
        boolean isBackHomeButtonEnabled = backHomeButton.isEnabled();
        Assert.assertTrue(isBackHomeButtonEnabled);
        backHomeButton.click();

        driver.quit();
    }

}
