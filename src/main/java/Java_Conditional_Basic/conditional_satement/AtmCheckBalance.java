package Java_Conditional_Basic.conditional_satement;

import java.util.Scanner;

public class AtmCheckBalance {
    public static void main(String[] args) {
        int balance =100000, withdraw, Pin =1234;
        Scanner i = new Scanner(System.in);
        int counter=0;

            for (int n=0;n<3;n++) {

                System.out.println("welcome to the DBBL  ATM ");
                System.out.println("please enter pin: ");
                int aa =i.nextInt();
                if (aa == Pin) {
                    System.out.println("Successfull!!!!");

                    while (true) {
                        System.out.println("choose 1 for withdraw");
                        System.out.println("choose 2 for check balance");
                        System.out.println("choose 3 for exit");
                        System.out.println("choose the number of which operation you want to perform: ");
                        int bb = i.nextInt();

                        switch (bb) {
                            case 1:
                                System.out.println("Enter balance: ");
                                withdraw = i.nextInt();

                                if (withdraw <= balance) {
                                    balance = balance - withdraw;
                                    System.out.println("Transaction processing! collect your money and card");
                                    System.out.println(withdraw + " debited from your account");
                                    System.out.println("current balance\n: " + balance);
                                } else {
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
                    }
                } else {
                    System.out.println("Wrong Password");
                    counter++;
                    if (counter == 3) {
                        System.out.println("System crashed: Can not do transaction. Please try after 3 minuits");
                    }
                }
            }



            }
        }




