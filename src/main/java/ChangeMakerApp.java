import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ChangeMakerApp {
  public static void main(String[] args){
  }

  Integer centsGiven;
  Integer centsOwed;
  String changeOwedString;


  public String makeChange(Integer centsGiven, Integer centsOwed){
    Integer changeOwed = centsGiven - centsOwed;
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nic = 0;
    Integer pennies = 0;
    String tellThemTheirChange = String.format("Change is %d quarters, %d dimes,
    %d nickels, and %d pennies", quarters, dimes, nic, pennies);
    
    if (centsGiven == centsOwed){
      changeOwedString = "no change";
    } else if (centsGiven < centsOwed){
      changeOwedString = "please pay more";
    } else {
      while (changeOwed > 25){
        changeOwed -= 25;
        quarters ++;
      }
    }

    return tellThemTheirChange;
  }
}
