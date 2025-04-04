/* Write a program to print Fibonacci series up to n terms using a while loop */
public class Main {
    public static void main(String[] args) {
            int n = 5;
            int first = 0, second = 1;

        System.out.print(first+" "+second+" ");

            while(n>2){
                int res = first + second;
                System.out.print(res+" ");
                first = second;
                second = res;
                n--;
            }
    }
}

