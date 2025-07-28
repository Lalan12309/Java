import java.util.Scanner;
public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int N=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(N+" ");
                N++;
            }
            System.out.println();
        }
    }
}
