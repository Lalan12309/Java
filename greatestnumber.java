import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greatest number:");
        }else if(b>a&&b>c){
            System.out.println("B is greatest number");
        }else{
            System.out.println("C is greatest number");
        }


    }
    
}
