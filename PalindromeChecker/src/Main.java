import java.util.Scanner;

public class Main {

    void isPalindrome(String str){
     String notReversedStr = str;
     char[] notRevStrArray = notReversedStr.toCharArray();
     char[] reversedStrArray = new char[notRevStrArray.length];

     for(int i=0;i< notRevStrArray.length;i++){
         reversedStrArray[i] = notRevStrArray[notRevStrArray.length - (i+1)];
     }

     String reversedStr = new String(reversedStrArray);

     if(str.isEmpty()){
         System.out.println("String is Empty,Please Provide String!");
     }
     else if(!str.isEmpty()){
         if(notReversedStr.equalsIgnoreCase(reversedStr)){
                 System.out.println("It's Palindrome!\n");
             }
         else{
                 System.out.println("It's not Palindrome!,Try any Other.\n");
             }
         }
    }

    public static void main(String[] args) {
     Main m = new Main();
     Scanner getInput = new Scanner(System.in);

     int choice = 1;

     while(choice!=0) {
         System.out.println("Enter String to Check its Palindrome or Not!");
         String str = getInput.next();
         if(str.equals("0")){
             break;
         }
         else{
         m.isPalindrome(str);
         }
         System.out.println("Check Another?(Enter 1 to Continue or 0 to Exit! ");
         choice = getInput.nextInt();
        }
     }
}