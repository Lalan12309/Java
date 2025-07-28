//package Function and Method;
import java.util.Scanner;
public class factorial {
    public static int Factoria(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int BC(int n,int r){
        int a=Factoria((n));
        int b=Factoria(r);
        int c=Factoria((n-r));
        int d=a/(b*c);
        return d;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a=Factoria(n);
        // System.out.println("The factorial is " +a);
            int e=BC(5, 2);
            System.out.println(e);
    }
    
}
