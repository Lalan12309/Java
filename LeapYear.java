import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year % 4 == 0 && year % 100 == 0 || year % 4==0){
            System.out.println("Year is Leap Year");
        }else{
            System.out.println("year is not leap Year");
        }
    }
    
}
