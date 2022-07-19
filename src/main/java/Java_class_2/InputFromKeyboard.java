/* Write a program to sum of user input until users input ‘q’ from keyboard */

package Java_class_2;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("enter input: ");
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        //char q =0;
        while(true){

            n=input.nextInt();

            sum=sum+n;
            System.out.println("sum: " +sum);
            //char ch = input.next().charAt(0);

            //if (n==Integer.parseInt(String.valueOf('q'))){
            if (n==Character.getNumericValue('q')){
                break;
            }
        }
    }

}
