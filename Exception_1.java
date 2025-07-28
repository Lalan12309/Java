import java.util.Scanner;
public class Exception_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        trynumber(n);
        int m=sc.nextInt();
        trynumber(m);

    }

    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + "even.");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());

        }

    }

    public static void checkEvenNumber(int number) {
        if(number%2!=0){
            throw new IllegalArgumentException(number + "is odd.");
        }

    }
}

