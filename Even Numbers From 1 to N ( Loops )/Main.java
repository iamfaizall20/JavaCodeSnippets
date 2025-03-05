public class Main {
    //printing Even Numbers from 1 to N
    static void EvenNumbers(int N){
        System.out.println("Even Numbers from 1 to "+N);
        for(int i=1; i<=N;i++){
            if(i%2==0){
                System.out.print(i + ", ");
            }
        }
    }
    public static void main(String[] args) {
        int N = 20;

        EvenNumbers(N);
    }
}