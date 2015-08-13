import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ChangeMakerApp {
  public static void main(String[] args){
  }

  Integer centsOwed;

  public Integer[] makeChange(Integer centsOwed){
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nic = 0;
    Integer pennies = 0;
    Integer[] amountOfEachCoin = {quarters, dimes, nic, pennies};
    //String tellThemTheirChange = String.format("Change is %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nic, pennies);

    // if (centsGiven == centsOwed){
    //   changeOwedString = "no change";
    // } else if (centsGiven < centsOwed){
    //   changeOwedString = "please pay more";
    // } else {

      while (centsOwed >0){

      if(centsOwed >= 25){
          centsOwed -= 25;
          quarters ++;
        } else if (centsOwed >=10){
          centsOwed -=10;
          dimes ++;
        } else if (centsOwed >=5){
          centsOwed -=5;
          nic ++;
        } else {
          centsOwed -=1;
          pennies ++;
      }
      }




    // do {
    //   centsOwed -= 10;
    //   dimes ++;
    // } while (centsOwed >= 10);

        amountOfEachCoin[0] = quarters;
        amountOfEachCoin[1] = dimes;
        amountOfEachCoin[2] = nic;
        amountOfEachCoin[3] = pennies;

  //  }
  //String tellThemTheirChange = String.format("Change is %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nic, pennies);

    return amountOfEachCoin;
  }



}
