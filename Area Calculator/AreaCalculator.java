import java.util.Scanner; //scanner class to get input

public class AreaCalculator {
    public static void main(String[] args) {
        //area calculator
        Scanner getInput = new Scanner(System.in); //scanner object

        int length,width,area;

        System.out.println("Enter Length and Width: ");
        length = getInput.nextInt();
        width = getInput.nextInt();

        area = length * width;

        System.out.println("Area: "+area);
    }
}