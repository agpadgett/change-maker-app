import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ChangeMakerApp {
  public static void main(String[] args){
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get ("/results", (request,response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/results.vtl");

      String howMuchChangeString = request.queryParams("userinput");
      Integer howMuchChange = Integer.parseInt(howMuchChangeString);
    //  Integer[] resultOfCalculations = makeChange(howMuchChange);
      String resultOfCalculations = makeChange(howMuchChange);

      model.put("result", resultOfCalculations);

      return new ModelAndView(model,layout);

    }, new VelocityTemplateEngine());

  }

  Integer centsOwed;

  public static String makeChange(Integer centsOwed){
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nic = 0;
    Integer pennies = 0;
    //Integer[] amountOfEachCoin = {quarters, dimes, nic, pennies};
    String tellThemTheirChange = String.format("Change is %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nic, pennies);



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


        // amountOfEachCoin[0] = quarters;
        // amountOfEachCoin[1] = dimes;
        // amountOfEachCoin[2] = nic;
        // amountOfEachCoin[3] = pennies;

  //  }
String tellThemTheirChange2 = String.format("Change is %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nic, pennies);
return tellThemTheirChange2;


    //  amountOfEachCoin;
  }



}
