 import java.util.Scanner;

public class Reverse {
//     public static void main(String[] args) {
//             Scanner sc= new Scanner(System.in);
//             String str=sc.nextLine();
//             for(int i=str.length()-1;i>=0;i--){
//                 System.out.print(str.charAt(i));
//             }
//         }
//     }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
}
}