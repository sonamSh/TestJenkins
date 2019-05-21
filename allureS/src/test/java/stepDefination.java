import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

    @Given("^Enter search term 'Cucumber' one$")
    public void enter_search_term_Cucumber_one() throws Throwable {
        System.out.println("given one");

    }

    @When("^Do search one$")
    public void do_search_one() throws Throwable {
        System.out.println("when one");
    }

    @Then("^Single result is shown for 'Cucumber' one$")
    public void single_result_is_shown_for_Cucumber_one() throws Throwable {
        System.out.println("then one");
    }

    @Given("^Enter search term 'Cucumber' two$")
    public void enter_search_term_Cucumber_two() throws Throwable {
        System.out.println("given two");
    }

    @When("^Do search two$")
    public void do_search_two() throws Throwable {
        System.out.println("when two");
    }

    @Then("^Single result is shown for 'Cucumber' two$")
    public void single_result_is_shown_for_Cucumber_two() throws Throwable {
        System.out.println("then two");
    }

    @Given("^Enter search term 'Cucumber' three$")
    public void enter_search_term_Cucumber_three() throws Throwable {
        System.out.println("given three");
    }

    @When("^Do search three$")
    public void do_search_three() throws Throwable {
        System.out.println("when three");
    }

    @Then("^Single result is shown for 'Cucumber' three$")
    public void single_result_is_shown_for_Cucumber_three() throws Throwable {
        System.out.println("then three");
    }

    @Given("^Enter search term 'Cucumber' four$")
    public void enter_search_term_Cucumber_four() {
        System.out.println("given four");
    }

    @When("^Do search four$")
    public void do_search_four() {
        System.out.println("when four");
    }

    @Then("^Single result is shown for 'Cucumber' four$")
    public void single_result_is_shown_for_Cucumber_four() {
        System.out.println("then four");
    }

    @Given("^Enter search term 'Cucumber' five$")
    public void enter_search_term_Cucumber_five() {
        System.out.println("given five");
    }

    @When("^Do search five$")
    public void do_search_five() {
        System.out.println("when five");
    }

    @Then("^Single result is shown for 'Cucumber' five$")
    public void single_result_is_shown_for_Cucumber_five() {
        System.out.println("then five");
    }

}
