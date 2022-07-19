/* Write a program to check if inputted letter is small or capital */

package Java_class_2;

import java.util.Scanner;

public class SmallCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input: ");
        char bb = input.next().charAt(0);

        if (bb>='A' && bb<='Z') {
            System.out.println(bb + " is a capital letter ");
        } else if (bb>='a' && bb<='z') {
            System.out.println(bb + " is a small letter");
        }
//        else if (bb>='0' && bb<='9'){
//            System.out.println(bb + " is a digit");
//      }
         else {
            System.out.println("Wong input");
        }
    }

}
