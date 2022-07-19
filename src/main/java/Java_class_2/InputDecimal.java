/* Input 2 decimal numbers and check if they are both same or different up to two decimal places. */

package Java_class_2;

import java.util.Scanner;

public class InputDecimal {
    public static void main(String[] args) {
        float x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        x = input.nextFloat();

        System.out.println("enter 2nd number: ");
        y = input.nextFloat();

        x = Math.round(x * 100);
        x = x / 100;

        y = Math.round(y * 100);
        y = y / 100;

        if (x == y)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }

    }

}
