package  main.java.co.za.cognify;

import java.util.Scanner;

/**
 * @formular 
 * C = (F − 32) × 5 ⁄ 9. 
 */
  class TemperatureConverter {

  public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Enter symbol for conversion ()C or F");
        String  tempSymbol = scanner.nextLine().toUpperCase(); // symbol from the user
        System.out.println("Enter quanity");
        int quantity = (scanner.nextInt()); // quanity from user
        double  temperature  = 0;


        if(tempSymbol.equals("C")){
            temperature = convertFromFahrenheitToCelsius(quantity , tempSymbol);
          System.out.println("Temperature :" + temperature + "C");
        }else if(tempSymbol.equals("F")){
          temperature = convertFromCalciusToFahnherit(quantity, tempSymbol);
          System.out.println("Temperature :" + temperature + "F");
       
        }

  

  }
    
    public static double convertFromFahrenheitToCelsius(int quanity , String toSymbol){
    
      return (quanity - 32.0) * (5.0/9.0);


  }
  public static double    convertFromCalciusToFahnherit(int quanity , String toSymbol){

    return quanity *(9.0/5.0) + 32.0;


  }
  

}

