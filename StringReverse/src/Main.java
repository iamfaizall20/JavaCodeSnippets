import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        String NStr;

        System.out.println("Enter any String to Reverse it: ");
        NStr = getInput.next();

        //converting string into Char array
        char[] nStr = NStr.toCharArray();

        //creating new char array for reverse string
        char[] RStr = new char[nStr.length];

        //Loop to reverse a string
        for(int i=0;i< nStr.length;i++){
            RStr[i] = nStr[nStr.length - (i+1)];
        }

        //created string to display reversed string
        String ReversedString = new String(RStr);

        System.out.println("Reverse of String "+NStr+" is "+ReversedString);
    }
}