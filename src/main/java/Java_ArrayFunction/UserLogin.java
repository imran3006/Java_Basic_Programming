/* Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times,
system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n */

package Java_ArrayFunction;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username;
        String password;
        username = "admin";
        password= "adm1n";
        Scanner input= new Scanner(System.in);
        int count=0;
        for (int i=0;i<3;i++){
            System.out.println("Enter Username: ");
            String uname= input.next();
            System.out.println("Enter Password: ");
            String pass= input.next();

            if (uname.equals(username) && (pass.equals(password))){
                System.out.println("Logged in successfully");
                break;
            }
            else if (uname.equals(username)){
                System.out.println("Wrong  pass");
                count++;
            }
            else if (pass.equals(password)){
                System.out.println("Wrong  user");
            }else{
                System.out.println("Wrong email and pass");
            }
        } if (count==3){
            System.out.println("user has been temporaray blocked");
        }

    }

}
