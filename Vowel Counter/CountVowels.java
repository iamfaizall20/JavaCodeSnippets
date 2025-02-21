import java.util.Scanner; //scanner class to get input

public class CountVowels {
    public static void main(String[] args) {
        //Vowel counter
        Scanner getInput = new Scanner(System.in); //scanner object

        String str = null;
        int countVowels = 0;

        System.out.print("Enter String: ");
        str = getInput.nextLine();

        char[] s = str.toCharArray(); //converted string into character array

        for(int i=0;i<str.length();i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' ||
                    s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U'){
                countVowels++;
            }
        }
        System.out.println("Number of Vowels: "+countVowels);

    }
}