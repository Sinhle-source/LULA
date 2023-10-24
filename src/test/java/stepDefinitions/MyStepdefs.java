package stepDefinitions;

import Base.Bases;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageActions;

public class MyStepdefs extends Bases {

    PageActions loginPageActions;

    @Given("^User on login page$")
    public void userOnLoginPage() {
       Bases.driverSetUp();
    }
    @When("^user enter username and password$")
    public void userEnterUsernameAndPassword() throws InterruptedException {
         loginPageActions = new PageActions();
        // loginPageActions.myAccount();
        loginPageActions.username();
        loginPageActions.password();
    }

    @When("^user enter incorrect username and password$")
    public void userEnterIncorrectUsernameAndPassword() throws InterruptedException {
        loginPageActions = new PageActions();
        // loginPageActions.myAccount();
        loginPageActions.incorrect_username();
        loginPageActions.incorrect_password();
    }

    @Then("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPageActions.clickLoginButton();
    }

    @Then("User verify the landing page name")
    public void user_verify_the_landing_page_name() {
        loginPageActions.userVerifyTheLandingPageName();
    }
    @Then("Select the product sorting icon and select the option Price low to high")
    public void select_the_product_sorting_icon_and_select_the_option() {
        loginPageActions.selectTheProductSortingIconAndSelectTheOption();
    }
    @Then("Add the item Sauce Labs Backpack to your cart")
    public void add_the_item_sauce_labs_backpack_to_your_cart() {
        loginPageActions.addTheItemSauceLabsBackpackToYourCart();
    }
    @Then("Confirm that the notification badge displays on the shopping cart icon.")
    public void confirm_that_the_notification_badge_displays_on_the_shopping_cart_icon() throws InterruptedException {
        loginPageActions.confirmThatTheNotificationBadgeDisplaysOnTheShoppingCartIcon();
    }
    @Then("Click the hamburger bar and logout")
    public void click_the_hamburger_bar_and_logout() throws InterruptedException {
        loginPageActions.clickTheHamburgerBarAndLogout();
    }

    @Then("confirm that the item Sauce Labs Backpack has the remove button displaying")
    public void confirm_that_the_item_sauce_labs_backpack_has_the_remove_button_displaying() throws InterruptedException {
        loginPageActions.confirm_that_the_item_sauce_labs_backpack_has_the_remove_button_displaying();
    }
    @Then("Confirm that clicking the remove button will remove the item from the basket")
    public void confirm_that_clicking_the_remove_button_will_remove_the_item_from_the_basket() throws InterruptedException {
        loginPageActions.confirm_that_clicking_the_remove_button_will_remove_the_item_from_the_basket();
    }
    @Then("^Go buy the Sauce Lab Onesie and add validations on the payment information and confirm the order is (.*) and (.*) and (.*) and (.*)$")
    public void go_buy_the_sauce_lab_onesie_and_add_validations_on_the_payment_information_and_confirm_the_order_is(String SauceCard, String firstname, String lastname ,String postalCode) throws InterruptedException {
        loginPageActions.go_buy_the_sauce_lab_onesie_and_add_validations_on_the_payment_information_and_confirm_the_order_is(SauceCard,firstname,lastname,postalCode);

    }

    @Then("Verify that Username and Password text displays")
    public void verify_That_Username_And_Password_Text_Displays() throws InterruptedException {
        loginPageActions.verify_That_Username_And_Password_Text_Displays();
    }

    @Then("Confirm the Login button has the correct css value")
    public void confirmTheLoginButtonHasTheCorrectCssValue() {
        loginPageActions.confirmTheLoginButtonHasTheCorrectCssValue();
    }

    @Then("^Confirm that the error message displays when login button is clicked (.*)$")
    public void confirmThatTheErrorMessageDisplaysWhenLoginButtonIsClickedError_mesage(String error_mesage) throws InterruptedException {
        loginPageActions.confirmThatTheErrorMessageDisplaysWhenLoginButtonIsClickedError_mesage(error_mesage);
    }

    @Then("Users can click the X icon on the error message to make it disappear")
    public void usersCanClickTheXIconOnTheErrorMessageToMakeItDisappear() throws InterruptedException {
        loginPageActions.usersCanClickTheXIconOnTheErrorMessageToMakeItDisappear();
    }

    @Then("Green tick icon displays")
    public void greenTickIconDisplays() throws InterruptedException {
        loginPageActions.greenTickIconDisplays();
    }

    @Then("^Your order has been dispatched (.*)")
    public void yourOrderHasBeenDispatched(String dispatched) throws InterruptedException {
        loginPageActions.yourOrderHasBeenDispatched(dispatched);
    }

    @Then("Back Home button is active and user can click on it")
    public void backHomeButtonIsActiveAndUserCanClickOnIt() throws InterruptedException {
        loginPageActions.backHomeButtonIsActiveAndUserCanClickOnIt();
    }



//    @Then("^user clicks on shop tab$")
//    public void userClicksOnShopTab() {
//        loginPageActions.shop();
//    }
//
//    @And("^User search the wine by name (.*)$")
//    public void userSearchTheWineByNameWineName(String wineName) {
//        loginPageActions.setSearchField(wineName);
//
//    }
//
//    @And("^user clicks checkout button$")
//    public void userClicksCheckoutButton() {
//        loginPageActions.wineName();
//    }
}
