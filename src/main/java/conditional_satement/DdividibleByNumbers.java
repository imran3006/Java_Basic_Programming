package conditional_satement;

public class DdividibleByNumbers {
    public static void main(String[] args) {
        int i,sum=0,gg=0;
        for (i=1;i<=100;i++){
            if (i%5==0){
                gg++;

                System.out.println( i);
                sum=sum+i;
            }
        }
        System.out.println("sum of the numbers divisible by 5 between  1 to 100: " + sum);

    }
}
