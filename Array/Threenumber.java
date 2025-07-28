//package Array;
import java.util.Scanner;
public class Threenumber {
    public static void main(String[] args) {
    
    int marks[]=new int[50];
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("Phy"+marks[0]);
    System.out.println("che"+marks[1]);
    System.out.println("math"+marks[2]);
    System.out.println("Array of the length" + marks.length);
    
}
}