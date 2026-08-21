
// que 1  coverting celcius to fahrenheit using formula (°C × 9/5) + 32 = °F by taking input from user
package QUE;

import java.util.Scanner;

public class Temperature {

    public static void main (String[] args){
        System.out.print("enter the temperature in celcius: ");
        Scanner sc = new Scanner(System.in);
        
        float celcius = sc.nextFloat();
        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println("the temperature in fahrenheit is: " + fahrenheit);

    }
    
}
