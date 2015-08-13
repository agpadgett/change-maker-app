import org.junit.*;
//import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;
import spark.template.velocity.VelocityTemplateEngine;




public class ChangeMakerAppTest {
  public static void main(String[] args){}


  @Test
  public void changeMakerApp_changeIs25OrMore_ReturnQuarters(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "3 quarters, 1 dimes, 0 nickels, and 0 pennies";
    assertEquals(fakeResult, testChangeMaker.makeChange(85));
  }

  @Test
  public void changeMakerApp_changeAfterQuartersIs10_ReturnDimes(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "1 quarters, 1 dimes, 0 nickels, and 0 pennies";
    assertEquals(fakeResult, testChangeMaker.makeChange(35));
  }

  @Test
  public void changeMakerApp_changeAfterDimesIs5_ReturnNickels(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "1 quarters, 1 dimes, 1 nickels, and 0 pennies";
    assertEquals(fakeResult, testChangeMaker.makeChange(40));
  }

  @Test
  public void changeMakerApp_changeAferDimesIs1_returnPennies(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    String fakeResult = "1 quarters, 0 dimes, 0 nickels, and 1 pennies";
    assertEquals(fakeResult, testChangeMaker.makeChange(26));
  }

}
