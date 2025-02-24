import java.util.Scanner;

public class CountWordsInAStirng {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int wordcount = 1;
        char[] arr;

        System.out.println("Enter String: ");
        String s = getInput.nextLine();

        arr = s.toCharArray();

        for(char i:arr){
             if(i==' ') {
                 wordcount++;
             }
        }
        System.out.println("\nTotal Words: "+wordcount);
    }
}
