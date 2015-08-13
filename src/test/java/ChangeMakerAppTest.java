import org.junit.*;
//import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;



public class ChangeMakerAppTest {
  public static void main(String[] args){}

  @Test
  public void changeMakerApp_forInputsAreEqual_NoChange(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "no change";
    assertEquals(fakeResult, testChangeMaker.makeChange(100, 100));
  }

  @Test
  public void changeMakerApp_forCostsMoreThanMoneyGiven_PleasePayMore(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "please pay more";
    assertEquals(fakeResult, testChangeMaker.makeChange(50,100));
  }

  @Test
  public void changeMakerApp_differenceIs25OrMore_ReturnQuarters(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "Change is 3 quarters, 0 dimes, 
    0 nickels, and 0 pennies";
    assertEquals(fakeResult, testChangeMaker.makeChange(100, 25));
  }
}
