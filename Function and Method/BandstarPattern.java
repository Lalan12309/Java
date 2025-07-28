public class BandstarPattern {
    public static void BS(int n){
        for(int i=1;i<n;i++){
           for(int j=1;j<n-i-1;j++){
            System.out.print("B");
           }
           for(int j=1;j<2*i+j;j++){
            System.out.print("*");
           }
        }
    }
    public static void main(String[] args) {
        BS(5);
    }
    
}
