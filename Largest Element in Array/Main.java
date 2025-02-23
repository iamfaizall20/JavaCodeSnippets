public class Main {
    public static void main(String[] args) {

        int [] arr = {12,25,35,45,55};
        int largest = arr[0];

        System.out.println("Array: ");
        for(int i:arr){
            System.out.print(i+" ");
            if(i>largest){
                largest = i;
            }
        }
        System.out.println("\nLargest Number in Array: " + largest);
        }
    }
