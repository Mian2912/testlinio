package co.com.tcs.testlinio.stepdefinitions;

import co.com.tcs.testlinio.tasks.DeleteProduct;
import co.com.tcs.testlinio.tasks.GoHogar;
import co.com.tcs.testlinio.tasks.GoShoppingCar;
import co.com.tcs.testlinio.tasks.SelectProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LinioStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Sebastian");
    }

    @Given("^the user is in the application (.*)$")
    public void theUserIsInTheApplicationHttpsWwwLinioComCo(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^the user search in categories in the section of (.*)$")
    public void theUserSearchInCategoriesInTheSectionOf(String direction) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoHogar.goHogar());
    }

    @When("^the user select product and add shooping car$")
    public void theUserSelectProductAndAddShoopingCar() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.selectProduct());
    }

    @Then("^the user go \"([^\"]*)\"$")
    public void theUserGo(String arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(GoShoppingCar.goShoppingCar());
    }

    @Then("^the use delete Product$")
    public void theUseDeleteProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteProduct.deleteProduct());
    }
}
