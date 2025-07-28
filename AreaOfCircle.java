import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       double radius=sc.nextFloat();
       double pi=3.12;
       double result=radius*pi;
       double parameter=3*pi*radius*radius;
        System.out.println(result);
        System.out.println(parameter);
    }
    
}
