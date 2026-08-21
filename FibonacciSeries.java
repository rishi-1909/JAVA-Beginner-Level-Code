
//  QUE 1.  write a program to print fibonacci series up to n terms.

package QUE;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main (String [] args){
        //  take the user input 
        System.out.print (" Enter the number: ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n){

            System.out.print (a + " ");
            int temp = b;
            b = b +a;
            a = temp;
            count++;
        }
        // System.out.println (b);

    } 
}
