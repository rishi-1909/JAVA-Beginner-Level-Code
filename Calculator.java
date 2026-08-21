
//  WE ARE CREATING A CALCULATOR TO ADD TWO NUMBER BY TAKING USER INPUT.
package QUE;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        // write statement to take user input as (number)
        
        System.out.println("Enter number below..");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1 value-> ");
        int num1 = in.nextInt();

        System.out.print("Enter num2 value-> ");
        int num2 = in.nextInt();

        System.out.println("-----------------------------");
        System.out.println("Enter 1 Addition");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Multipllication");
        System.out.println("Enter 4 your Division ");
        System.out.println("Enter 5 for Modulo");

        System.out.println("------------------------------");

        System.out.println("Enter your choice= ");
        int choice = in.nextInt();
        System.out.println("-------------------------------");
        
        if  (choice == 1){
            int result = num1 + num2;
            System.out.println("The addition of two numbe is= "+ result);
        }else if (choice == 2){
        int  result = num1  - num2;
        System.out.println("The Substraction of two number is= "+ result);
        }else if (choice ==3){
            int result = num1 * num2;
            System.out.println("The  multiplication of two number is = "+ result);
        } else if (choice == 4){
            int result = num1 / num2;
            System.out.println("The Division of two number is= "+ result);
        }else if (choice == 5 ) {
            int result = num1 % num2;
            System.out.println("The Module of two number is= "+result);
        }else{
            System.out.println("Enter choose correct choice..!!!");
        }
    }
    
}
