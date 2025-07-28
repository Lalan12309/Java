import java.util.Scanner;
import java.util.Arrays;
public class SecondLargesr {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.println("SOrted arr is " + arr[i]);
        }
        int arr2=arr.length-2;
        System.out.println("Second largest Elelment is :");
        System.out.println(arr2);
    }
    
}
