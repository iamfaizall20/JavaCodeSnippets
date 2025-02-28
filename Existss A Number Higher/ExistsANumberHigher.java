import java.util.Scanner;

public class ExistsANumberHigher {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        int[] myArray = {22, 55, 44, 66, 78};
        System.out.print("Enter Number: ");
        int num = getInput.nextInt();

        // Initialize largest with the first element of the array
        int largest = myArray[0];

        // Find the largest number in the array
        for (int i : myArray) {
            if (i > largest) {
                largest = i;
            }
        }
        // Check if the largest number is greater than or equal to input
        System.out.println(largest >= num);
    }
}
