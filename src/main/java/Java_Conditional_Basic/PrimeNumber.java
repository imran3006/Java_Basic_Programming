package Java_Conditional_Basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int aa =input.nextInt();

        int i, count=0;
        for ( i=2;i<aa/2;i++){
            if (aa%i==0){
                count++;
                break;

            }

            }

        if (count==1){
            System.out.println("not prime");
        }else {
            System.out.println("prime");
        }
        }

    }

