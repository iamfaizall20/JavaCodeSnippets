import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int num;

        System.out.print("Enter Number: ");
        num = getInput.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz"); ;
        } else if (num % 3 == 0) {
            System.out.println("Fizz");;
        } else if (num % 5 == 0) {
            System.out.println("Buzz");;
        } else {
            System.out.println("" + num); ;
        }
    }
}
