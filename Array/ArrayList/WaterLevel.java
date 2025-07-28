//package Array.ArrayList;
import java.util.ArrayList;;
public class WaterLevel {
    public static int storeWater(ArrayList<Integer> height) 
{
int maxwater=0;
int lp=0;
int rp=height.size()-1;
while(lp<rp){
    int ht=Math.min(height.get(lp),height.get(rp));
    int width=rp-lp;
    int currentwater=ht*width;
    maxwater=Math.max(maxwater,currentwater);
    if(height.get(lp)<height.get(rp)){
        lp++;
    }
    else{
        rp--;
    }
}
return maxwater;
    
}
public static void main(String[] args) {
    ArrayList<Integer> l=new ArrayList<>();
    l.add(1);
    l.add(8);
    l.add(6);
    l.add(2);
    l.add(5);
    l.add(4);
    l.add(8);
    l.add(3);
    l.add(7);
    System.out.println(storeWater(l));
    
}
}
