import java.util.Scanner;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;  // Start from the end of string a
        int j = b.length() - 1;  // Start from the end of string b
        int carry = 0;           // Initialize carry to 0

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;     // Start with the carry from the previous iteration
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int and add to sum
                i--; // Move to the next bit
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int and add to sum
                j--; // Move to the next bit
            }
            
            result.append(sum % 2); // Append the current bit (sum % 2)
            carry = sum / 2;        // Update carry (sum divided by 2)
        }

        return result.reverse().toString(); // Reverse and return the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        // Read binary strings from the user
        System.out.print("Enter the first binary string: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second binary string: ");
        String b = scanner.nextLine();
        
        // Compute the sum of the binary strings
        String result = solution.addBinary(a, b);
        
        // Output the result
        System.out.println("The sum of binary strings " + a + " and " + b + " is " + result);
        
        // Close the scanner
        scanner.close();
    }
}
