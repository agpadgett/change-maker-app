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
    Integer[] fakeResult = {3,1,0,0};
    assertEquals(fakeResult, testChangeMaker.makeChange(85));
  }

  @Test
  public void changeMakerApp_changeAfterQuartersIs10_ReturnDimes(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    Integer[] fakeResult = {1,1,0,0};
    assertEquals(fakeResult, testChangeMaker.makeChange(35));
  }

  @Test
  public void changeMakerApp_changeAfterDimesIs5_ReturnNickels(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    Integer[] fakeResult = {1,1,1,0};
    assertEquals(fakeResult, testChangeMaker.makeChange(40));
  }

  @Test
  public void changeMakerApp_changeAferDimesIs1_returnPennies(){
    ChangeMakerApp testChangeMaker = new ChangeMakerApp();
    Integer[] fakeResult = {1, 0, 0, 1};
    assertEquals(fakeResult, testChangeMaker.makeChange(26));
  }

}
