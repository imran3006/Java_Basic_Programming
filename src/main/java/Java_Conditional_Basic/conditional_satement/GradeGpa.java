package Java_Conditional_Basic.conditional_satement;

import java.util.Scanner;

public class GradeGpa {
    public static void main(String[] args) {
        System.out.println("welcome to the GPA and Grade calculating system-- \n"
        + "enter the marks of the subjects");
        Scanner input = new Scanner(System.in);

        double a,b,c,d,e,f,g,k,l,m;




        System.out.println("bangla: ");
        a = input.nextDouble();
        System.out.println("Credit: ");
        f = input.nextDouble();

        System.out.println("English: ");
         b = input.nextDouble();
        System.out.println("Credit: ");
        g = input.nextDouble();


        System.out.println("Math: ");
        c  = input.nextDouble();
        System.out.println("Credit: ");
        k = input.nextDouble();

        System.out.println("General knowledge: ");
        d = input.nextDouble();
        System.out.println("Credit: ");
         l = input.nextDouble();

        System.out.println("Science: ");
        e = input.nextDouble();
        System.out.println("Credit: ");
        m = input.nextDouble();

        double gpa =  ((a*f) + (b*g)+ (c*k) + (d*l)+ (e*m))/(f+g+k+l+m) ;
        System.out.println("GPA will be: " + gpa);

        if (gpa >= 80 && gpa <=100 || gpa<=4){
            System.out.println("Grade: A+");
        }else if(gpa >=75 && gpa <80 || gpa>= 3.75 && gpa <=3.99){
            System.out.println("Grade: A");
        }else if(gpa >=70 && gpa <75 || gpa>= 3.50 && gpa <3.75){
            System.out.println("Grade: A-");
        }else if(gpa >=65 && gpa <70 || gpa>= 3.25 && gpa <3.50){
            System.out.println("Grade: B+");
        }else if(gpa >=60 && gpa <65 || gpa>= 3.00 && gpa <3.25){
            System.out.println("Grade: B");
        }else if(gpa >=55 && gpa <60 || gpa>= 2.75 && gpa <3.00){
            System.out.println("Grade: B-");
        }else if(gpa >=50 && gpa <55 || gpa>= 2.50 && gpa <2.75){
            System.out.println("Grade: C");
        }else if(gpa >=45 && gpa <50 || gpa>= 2.25 && gpa <2.50){
            System.out.println("Grade: C-");
        }else if(gpa >=40 && gpa <45 || gpa>= 2.00 && gpa <2.25) {
            System.out.println("Grade: D");
        }else if(gpa >=0 && gpa <40 || gpa>=0 && gpa<2.00) {
            System.out.println("Grade: Failed");
        }else {
            System.out.println(" result Incomplete");
        }







    }
}
