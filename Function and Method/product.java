//package Function and Method;
import java.util.Scanner;
public class product {
    public static int Product(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Product(a, b);
        System.out.println("The Product is " + c);
       c= Product(10, 20);
       System.out.println("Product is "+c);
    }
    
}
