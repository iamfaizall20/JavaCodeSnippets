//Number Classification Program
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int value = getInput.nextInt();

        if(value == 0) System.out.println("It's Zero");
        else if(value > 0) System.out.println("It's a Positive Integer");
        else System.out.println("It's an Negative Integer");
    }
}
/*
Test Cases

Test Case 1:
Input: 0
Output: It's Zero

Test Case 2:
Input: 7
Output: It's a Positive Integer

Test Case 3:
Input: -3
Output: It's a Negative Integer

 */