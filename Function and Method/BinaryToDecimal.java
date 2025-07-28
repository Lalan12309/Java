import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDec(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int LastDigit=n%10;
             dec=dec+(LastDigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;

        }
        System.out.println("The binary "+ mynum + "=" + dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binToDec(n);
    }
    
}
