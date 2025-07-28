//package Array;
import java.util.Scanner;
public class BinarySearch {
    public static int Binary(int num[],int key){
        int Start=0;
        int End=num.length-1;
        while(Start<End){
         int mid=(Start+End)/2;
        
        if(num[mid]==key){
            return mid ;

        } if(num[mid]<key){
            Start=mid+1;
        }else{
            Start=mid-1;
        }
        
    }
    return -1;
    
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the number");
    int size=sc.nextInt();
;    int[] num=new int[size];
for(int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
}
System.out.println("Enter the number to be Searched : ");
int key=sc.nextInt();
    int result =Binary(num, key);
    System.out.println("The index is " + result);
}
}