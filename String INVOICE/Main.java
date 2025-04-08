public class Main {

    public static void Print(String name,String tech,String time){
        System.out.printf("%-22s%-15s%-15s%n",name,tech,time);
    }

    public static void main(String[] args) {

        System.out.printf("%-22s%-15s%-15s%n","Project Name","Technologies","Duration");
        System.out.print("--------------------------------------------\n");
        Print("Task Manager","Java,SQL","One Week");
        Print("Reservation System","Java,SQL","Two Weeks");
    }
}