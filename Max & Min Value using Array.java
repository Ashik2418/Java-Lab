import java.util.Scanner;

public class LabTask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("The Number: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter Number: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("Maximum value " + max);
        System.out.println("Minimum value " + min);
    }
}
