import java.util.Scanner;

public class Solution {
    private static final int MOD = 1000000007;
    
    // Helper function to check if a number is beautiful
    private boolean isBeautiful(long num) {
        if (num == 1) return false;
        
        // Check if number itself is prime
        if (isPrime(num)) return true;
        
        // Find all factors excluding 1 and the number itself
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                // If i is a factor, check if it's prime
                if (!isPrime(i)) return false;
                // Check the corresponding factor num/i
                if (num / i != i && !isPrime(num / i)) return false;
            }
        }
        return true;
    }
    
    // Helper function to check if a number is prime
    private boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (n + 2) == 0) return false;
        }
        return true;
    }
    
    public int countBeautifulSubsequences(int[] arr) {
        int n = arr.length;
        long count = 0;
        
        // Total number of possible subsequences is 2^n
        // We exclude empty subsequence, so we go from 1 to 2^n - 1
        for (int mask = 1; mask < (1 << n); mask++) {
            long product = 1;
            boolean overflow = false;
            
            // Calculate product for current subsequence
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    // Check for potential overflow
                    if (product > Long.MAX_VALUE / arr[i]) {
                        overflow = true;
                        break;
                    }
                    product *= arr[i];
                }
            }
            
            // If no overflow, check if product is beautiful
            if (!overflow && isBeautiful(product)) {
                count = (count + 1) % MOD;
            }
        }
        
        return (int)count;
    }
}
    public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get array size from user
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        // Validate constraints
        if (n <= 0 || n >= 100000) {
            System.out.println("Array size must be between 1 and 10^5");
            return;
        }
        
        int[] arr = new int[n];
        
        // Get array elements from user
        System.out.println("Enter " + n + " positive integers (each < 10^9):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            // Validate input constraints
            if (arr[i] <= 0 || arr[i] >= 1000000000) {
                System.out.println("Each element must be between 1 and 10^9");
                return;
            }
        }
        
        Solution sol = new Solution();
        int result = sol.countBeautifulSubsequences(arr);
        
        System.out.println("Number of beautiful subsequences: " + result);
        
        sc.close();
    }
}