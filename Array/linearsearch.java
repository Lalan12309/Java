//package Array;

import java.util.Scanner;

public class linearsearch {
    public static int Linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th number :");
        int size=sc.nextInt();
        int num[]=new int[size];
        
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be Search : ");
        int key=sc.nextInt();
        int result=Linear(num, key);
        if(result==-1){
            System.out.println("not founded");
        }else{
            System.out.println("Key is at index " + result);
        }
    }
    
}
