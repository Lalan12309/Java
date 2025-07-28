import java.util.Scanner;

public class NthWithoutLoop {
    public static void  print(int n){
        if(n==0)
            return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //int n=5;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()
        print(n);
        //System.out.println(print(n));
    }
}
