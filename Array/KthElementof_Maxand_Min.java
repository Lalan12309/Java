import java.util.*;

public class KthElementof_Maxand_Min {
    static void Smallest(int[] arr, int k) {
        Arrays.sort(arr);  
        System.out.println("Kth Smallest: " + arr[k - 1]);  
    }

    static void Largest(int[] arr, int l) {
        Integer[] tempArr = Arrays.stream(arr).boxed().toArray(Integer[]::new); // Convert to Integer array
        Arrays.sort(tempArr, Collections.reverseOrder()); 
        System.out.println("Kth Largest: " + tempArr[l - 1]);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter k (smallest): ");
        int k = sc.nextInt();
        System.out.print("Enter l (largest): ");
        int l = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Smallest(arr, k);
        Largest(arr, l);

        sc.close();
    }
}
