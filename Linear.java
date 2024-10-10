import java.util.Arrays;
import java.util.Scanner;

public class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // Linear Search
        System.out.print("Enter the value to search using Linear Search: ");
        int target = sc.nextInt();
        int linearResult = linearSearch(array, target);
        System.out.println("Linear Search result: " + (linearResult != -1 ? "Found at index " + linearResult : "Not found"));
    }
    // 1. Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
