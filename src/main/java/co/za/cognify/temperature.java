package main.java.co.za.cognify;

public class temperature {
    public  static  void main(String[] args) {
        TemperatureConverter temperature = new TemperatureConverter('C','F',200);
        System.out.println(temperature.convertingFromFarenheitTpCalcius('C','F',200));
        System.out.println(temperature.convertingFromCalciusToFarenheit('F','C',180));

    }
}
