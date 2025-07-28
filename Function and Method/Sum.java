//package Function and Method;
import java.util.Scanner;
// public class Sum {
//     public static void CalculateSum(int a,int b){
//         int sum=a+b;
//         System.out.println("sum is " +sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
        
//     CalculateSum(a, b);
//     }
    
// }
public class Sum{
    public static int CalculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=CalculateSum(a, b);
        System.out.println("Sum is " +c);
        
    }
}