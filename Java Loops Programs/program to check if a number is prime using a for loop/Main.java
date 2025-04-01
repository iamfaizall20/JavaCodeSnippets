/* Write a program to check if a number is prime using a for loop. */
public class Main {
    public static void main(String[] args) {
            int num = 6;
            boolean isPrime = true;

            if(num < 2) {
                isPrime = false;
            }else{


            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        System.out.println((isPrime) ? "Prime Number" : "It's Not a Prime Number");
            }
    }

}

