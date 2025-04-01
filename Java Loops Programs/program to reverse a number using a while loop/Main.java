/* Write a program to reverse a number using a while loop */
public class Main {
    public static void main(String[] args) {
            int num = 468;
            int revNum = 0;

            while(num!=0){
                int n = num%10;
                revNum = revNum*10 + n;
                num/=10;
            }
        System.out.println(revNum);
    }
}
