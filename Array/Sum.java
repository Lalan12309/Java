import java.util.Scanner;

public class Sum {
    public static int[] calculateCumulativeSum(int[] arr) {
        int[] cumulativeSum = new int[arr.length];
        cumulativeSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + arr[i];
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] cumulativeSum = calculateCumulativeSum(arr);
        System.out.print("Cumulative sum array ");
        for (int i = 0; i < cumulativeSum.length; i++) {
            System.out.print(cumulativeSum[i] + " ");
        }
    }
}
