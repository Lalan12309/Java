//package Array;

public class Largestnumber {
    public static int Largest(int num[]){
        int largest=Integer.MIN_VALUE;
        int smaller=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smaller>num[i]){
                smaller=num[i];
            }
        }
        System.out.println("Smaller number " + smaller);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,6,8,5};
       System.out.println("Largest numer is : " + Largest(num));
    }
    
}
