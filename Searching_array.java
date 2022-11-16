import java.util.Scanner;

public class Searching_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //        Take the input for the number of elements from the user
        System.out.println("Enter the number of elements in the array: ");
        int num = in.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<num;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int a = in.nextInt();
        System.out.println();
        boolean found = false;
        for (int i: arr){
            if(i==a){
                found= true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in the array");
        }
        else {
            System.out.println("Element is nowhere to be found in the array");
        }
    }
}
