/*  Write a program to check balance and withdraw money from ATM booth using if else or switch case */

package Java_class_2;

import java.util.Scanner;

public class AtmCheckBalance {
    public static void main(String[] args) {
        int balance =100000, withdraw, Pin =1234;
        Scanner i = new Scanner(System.in);
        while (true){
            System.out.println("welcome to the DBBL  ATM ");
            System.out.println("please enter pin: ");
            int aa =i.nextInt();
            if(aa==Pin){
                System.out.println("Successfull!!!!");
                System.out.println("choose 1 for withdraw");
                System.out.println("choose 2 for check balance");
                System.out.println("choose 3 for exit");
                System.out.println("choose the number of which operation you want to perform: ");
                int bb = i.nextInt();

                switch (bb){
                    case 1:
                        System.out.println("Enter balance: ");
                        withdraw = i.nextInt();

                        if (withdraw<=balance){
                            balance = balance-withdraw;
                            System.out.println("Transaction processing! collect your money and card");
                            System.out.println(withdraw + " debited from your account");
                            System.out.println("current balance\n: " + balance);
                        }else {
                            System.out.println("Insufficient balance");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("your current balance is " + balance);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);

                }
            }else {
                System.out.println("Wrong Pin");
            }
        }

    }

}
