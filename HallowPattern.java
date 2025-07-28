import java.util.Scanner;
public class HallowPattern {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int R=sc.nextInt();
    int C=sc.nextInt();
    for(int i=1;i<=R;i++){
        for(int j=1;j<=C;j++){
            if(i==1||i==R||j==1||j==C){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    
}
