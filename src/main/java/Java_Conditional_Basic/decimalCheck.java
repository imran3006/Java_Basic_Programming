package Java_Conditional_Basic;

import java.util.Scanner;

public class decimalCheck {
    public static void main(String[] args) {
        float x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        x = input.nextFloat();

        System.out.println("enter 2nd number: ");
        y = input.nextFloat();

        if(Math.round(x)==Math.round(y)){
            System.out.println("Matches");
        }
        else{
            System.out.println("Didn't match");
        }
    }
}
