package Java_Conditional_Basic.conditional_satement;

import java.util.Scanner;

public class prblm_1_positive_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number > 0){

            System.out.println(number + " is a positive number");
        }else if(number < 0) {
            System.out.println(number + " is a negative number");
        }else {
            System.out.println("number is Zero");
        }



    }
}
