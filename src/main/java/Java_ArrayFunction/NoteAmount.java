/* Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1] */

package Java_ArrayFunction;

import java.util.Scanner;

public class NoteAmount {
    public static void main(String[] args) {
        int i,amnt;
        int notes[]= {1000,500,100,50,20,10,5,2,1};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter amount: ");
        amnt = input.nextInt();
        int noteCount;
        for(i=0;i<9;i++){
            noteCount=amnt/notes[i];
            if (noteCount==0){
                continue;
            }
            amnt= amnt% notes[i];
            System.out.println(notes[i]  + " : " +
                    noteCount);
        }


    }
}
