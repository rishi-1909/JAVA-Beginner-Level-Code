package QUE;
import java.util.Scanner;

public class OddEven {
    
    public static void main (String[] args){
        // user input to check if the number is odd or even
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if (n % 2== 0){
            System.out.println ("the number is even--> " + n);
        }else {
            System.out.println("the number is odd--> " + n);
        }
    }
}
