package cucumber2.test1.copy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	
	@Given ("I enter 50 in this calculator")
public void abc()
{
		System.out.println("I enter 50 in this calculator");
}
	@And ("I press add")
	public void abc1()
	{
			System.out.println("I press add");
	}
	@And ("I have entered 50 in this calculator")
	public void abc2()
	{
			System.out.println("I have entered 50 in this calculator");
	}
    @When("I press equal symbol")
    public void abc3()
   {
		System.out.println("I press equal symbol");
   }
   @Then("The result should be 100 on the screen")
    public void abc4()
   {
		System.out.println("The result should be 100 on the screen");
   }
	
	
   @Given ("I enter 40 in this calculator")
   public void abc5()
   {
   		System.out.println("I enter 40 in this calculator");
   }
   	@And ("I press sub")
   	public void abc6()
   	{
   			System.out.println("I press sub");
   	}
   	@And ("I have entered 30 in this calculator")
   	public void abc7()
   	{
   			System.out.println("I have entered 30 in this calculator");
   	}
 
      
      @Then("The result should be 10 on the screen")
       public void abc9()
      {
   		System.out.println("The result should be 10 on the screen");
      }
   	
   	

}
