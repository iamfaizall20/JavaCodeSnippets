import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in); //Scanner class to get input from user

        System.out.println("------- Factorial Finder -------\n");

        String choice = "Y";
        String num;

        while(choice.equals("Y") || choice.equals("y")){
            System.out.println("Enter any Number to find its Factorial : ");
            num = getInput.next();

            if(num.equals("n") || num.equals("N")){
                break; //if user enters "N or n" then program terminates
            }
            else if (num.equals("0")){ //if user enters 0 then factorial will be 1
                System.out.println("Factorial of "+num+" is 1\n");
            }
            else{
                int factorial = 1;
                int num1 = Integer.parseInt(num); //converting string into an Integer

                if(num1>0) { //check that number is postive integer
                    for (int i = 1; i <= num1; i++) {
                        factorial *= i; //for loop to calculate factorial and store in variable named factorial
                    }
                System.out.println("Factorial of "+num1+" is "+factorial+"\n");
                }
                else{
                    System.out.println("Invalid Input!,Factorial aren't defined for negative numbers.\n");
                }
            }
            System.out.println("Want to Check Another? (Y/N): ");
            choice = getInput.next();
        }
    }
}