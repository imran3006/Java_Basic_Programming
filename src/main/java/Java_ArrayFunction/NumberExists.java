/*  Take input from a user and check if the number exists in the array
let the array is [1,3,5,7,2,4,6,8]
Input: 7
Output: Found in the position 3
Input: 9
Output: Found no element */



package Java_ArrayFunction;

import java.util.Scanner;

public class NumberExists {
    public static void main(String[] args) {
        System.out.println("enter Input: ");
        Scanner input = new Scanner(System.in);

        int arr[] = {1,3,5,7,2,4,6,8};
        int counter=0, bb =0;
        int aa= input.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==aa){
                counter++;
                //System.out.println("found in position:" + i);
                bb=i;

            }
        }if (counter==1) {
            System.out.println("found in position: " + bb);
        }    else {
            System.out.println("not found");
        }
    }
}



