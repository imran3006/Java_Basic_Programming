package Java_Conditional_Basic.conditional_satement;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("enter input: ");
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        while(true){

            n=input.nextInt();
            sum=sum+n;
            System.out.println("sum: " +sum);
            //char ch = input.next().charAt(0);

            if (n==-1){
                break;
            }
        }
    }
}
