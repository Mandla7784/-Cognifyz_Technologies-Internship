package  main.java.co.za.cognify;

/**
 * 
 * @params {units}
 *
 *
 */
public  class TemperatureConverter {
    public char  unitToSymbol;
    public char  unitFromSymbol;
    public double quantity;

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
  static  int convertingFromCalciusToFarenheit( char unitToSymbol , char unitFromSymbol, int quantity){

      if(unitFromSymbol != 'C'){
        
        throw  new ArithmeticException("Invalid symbol");
  }
  
  return  Math.round((quantity *(9/5)) + 32)  ;
  

}


/**
   * @param unitToSymbol
   * @param unitFromSymbol
   * @param quantity
   *
   */

  static int  convertingFromFarenheitTpCalcius( char unitToSymbol , char unitFromSymbol, int quantity){

    if(unitFromSymbol != 'F')throw  new ArithmeticException("Invalid symbol");
    return  Math.round(quantity - 32) *(5/9);

  }}

//convertingFromFarenheitTpCalcius