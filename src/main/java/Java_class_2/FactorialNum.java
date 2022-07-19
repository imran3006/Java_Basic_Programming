/* Write  a program to find the factorial of a given number */
package Java_class_2;

import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int aa =input.nextInt();
        int i, sum=1;
        for(i=1;i<=aa;i++){
            sum= sum*i;
        }
        System.out.println(sum);
    }
}
