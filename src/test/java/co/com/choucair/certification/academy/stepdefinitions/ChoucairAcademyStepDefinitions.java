package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
// para el given siempre se usa wsAbleTo
    @Given("^than katherin wants to learn automation at the academy Choucair$")
    public void thanKaterinWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("katherin").wasAbleTo(OpenUp.thePage());
    }

// para el when siempre se usa el attemptsTo()
    @When("^She search for the course recursos Automatización Bancolombia on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform() {
    }

    @Then("^She finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
    }

}
