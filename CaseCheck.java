package QUE;
import java.util.Scanner;

public class CaseCheck {

    public static void main (String[] args){

        System.out.print("Enter the character:  ");
        Scanner ch = new Scanner (System.in);
        char c = ch.next().trim().charAt(0);

        if ('a'<= c && 'z'>= c){
            System.out.println("the character is in lower case--> " + c);
        }else {
            System.out.println ("the character is in upper case--> " + c);
        }


    }
    
}
