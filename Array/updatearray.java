//package Array;

public class updatearray {
    public static void update(int mark[],int nonchangabl){
        nonchangabl=15;
        for(int i=0;i<mark.length;i++){
            mark[i]=mark[i]+1;
        }
    }
    public static void main(String[] args) {
        //int mark[]=new int[50];
        int mark[]={2,3,5};
        int nonchangabl=5;
        update(mark,nonchangabl);
        System.out.println(nonchangabl);
        for(int i=0;i<mark.length;i++){
            System.out.print(mark[i] + " ");
        }
        System.out.println();

    }
   
    
}
