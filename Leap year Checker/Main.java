import java.util.Scanner;

//Leap year Checker
public class Main {
    static void LeapYearChecker(int year){
        System.out.println( (year%400==0 )||( year%4==0 && year%100!=0)
                ? "It's Leap Year" :
                "It's not Leap year");
    }
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = getInput.nextInt();

        LeapYearChecker(year);
    }
}
/*
Expected Output:

Test Case 1:
Input: 2000
Output: It's a Leap Year

Test Case 2:
Input: 1900
Output: It's not a Leap Year
*/