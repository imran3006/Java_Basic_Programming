/* Write a program to enter the numbers till the user wants and at the end,
 the program should display the largest and smallest numbers user entered. */

package Java_class_2;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        int smallest =0,largest=0, num;
        System.out.println("enter num of inputs you want here: ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        num = input.nextInt();
        smallest=num;

        for (int i=2;i<=n;i++){
            //System.out.println("Enter random number: ");
            num = input.nextInt();
            if (num >largest){
                largest = num;
            }
            if (num< smallest){
                smallest= num;
            }

        }
        System.out.println("largest number is: " + largest);
        System.out.println("smallest number is: " + smallest);

    }

}
