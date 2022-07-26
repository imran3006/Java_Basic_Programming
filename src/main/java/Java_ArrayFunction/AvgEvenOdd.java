/* Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers() */

package Java_ArrayFunction;

import java.util.Scanner;

public class AvgEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the size of array: ");
        int aa = sc.nextInt();
        double[] arr = new double[aa];
        System.out.println("Enter elements: ");
        for (int i = 0; i < aa; i++) {
            arr[i] = sc.nextInt();
        }
        //double arrr[]= {5,6,5,6,10,9};
        average(arr);
        countEvenNumbers(arr);
        counOddNumbers(arr);

    }


    public static void average(double[] num) {
        double total = 0;
        for (int i = 0; i < num.length; i++) {
            total = total + num[i];

        }
        double average = total / num.length;
        System.out.println("average will be: " + average);


    }

    public static void countEvenNumbers(double[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers: " + count);
    }

    public static void counOddNumbers(double[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Total odd numbers: " + count);

    }

}
