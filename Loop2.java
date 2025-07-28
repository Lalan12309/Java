import java.util.Scanner;
public class Loop2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Range=sc.nextInt();
        int count=1;
        while(count<=Range){
            System.out.print(count + " ");
            count++;
        }
    }
    
}
