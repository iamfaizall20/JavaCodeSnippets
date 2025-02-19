import java.util.Scanner;

public class TaskFour {
    public static void main (String [] args){
        Scanner getInput = new Scanner(System.in);

        int num;
        System.out.print("Enter number: ");
        num = getInput.nextInt();

        if (num%2!=0){
            System.out.println(num+" is Odd Number");
        }else{
            System.out.println(num+" is Even Number");
        }
    }
}
