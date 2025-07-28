import java.util.Scanner;
public class Fronthash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String input = sc.nextLine();
        
        // Variables to store the count of '#' and the new string without '#'
        int hashCount = 0;
        String result = "";
        
        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '#') {
                // Count '#' characters
                hashCount++;
            } else {
                // Add non-# characters to the result string
                result += ch;
            }
        }
        
        // Print '#' hashCount times
        for (int i = 0; i < hashCount; i++) {
            System.out.print('#');
        }
        
        // Print the result string with non-# characters
        System.out.println(result);
        
        sc.close();
    }
}

    

