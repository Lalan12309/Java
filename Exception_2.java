public class Exception_OddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= 8;
        trynumber(n);
        int n=5;
        trynumber(n);

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
