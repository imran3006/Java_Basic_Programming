package conditional_satement;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        //int rand1 = (int)(Math.random()*100) + 1;
        //int rand2 = (int)(Math.random()*100) + 1;
        //System.out.println(rand1);
        //System.out.println(rand2);
        int point=0;
        Scanner input = new Scanner(System.in);
        //int n =input.nextInt();
        for (int i=0;i<5;i++){
            int rand1 = (int)(Math.random()*100) + 1;
            int rand2 = (int)(Math.random()*100) + 1;
            //System.out.println(rand1);
            //System.out.println(rand2);
            System.out.println("Enter number: ");
            int n =input.nextInt();
          if (n==rand1 || n==rand2){
              point++;
              System.out.println("point added");
          }  else {
              System.out.println("sorry cant add points here");
          }

        }
        System.out.println("Total points: " + point );


    }
}
