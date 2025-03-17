package  main.java.co.za.cognify;

/**
 * TODO: create a Class to convert a Temperature
 * @params {units}
 *
 *
 */
public  class TemperatureConverter {
    public  unitToSymbol;
    public  unitFromSymbol;
    public  quantity;

  public  TemperatureConverter( char unitToSymbol , char unitFromSymbol, double quantity){

      this.unitToSymbol = unitToSymbol;
      this. unitFromSymbol = unitFromSymbol;
      this.quantity = quantity;

  }

    /**
     *
     * @param unitToSymbol
     * @param unitFromSymbol
     * @param quantity
     */
  static  double convertingFromCalciusToFarenheit( char unitToSymbol , char unitFromSymbol, double quantity){
      if(unitFromSymbol == 'C'){
          double calcius = quantity *(9/5) + 32;

          return res;

      }

  }
  /**
   * @param unitToSymbol
   * @param unitFromSymbol
   * @param quantity
   *
   */
   static  double convertingFromFarenheitTpCalcius( char unitToSymbol , char unitFromSymbol, double quantity){
     if(unitFromSymbol == 'F'){
         double  Fahrenheit = (quantity - 32) *(5/9);

         return  Fahrenheit;

     }
   }
}