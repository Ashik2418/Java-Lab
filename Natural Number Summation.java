import java.util.Scanner;

public class LabTask02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter integer N: ");
        int N = scanner.nextInt();
        
   
        scanner.close();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            
        }
        
        System.out.println("sum is: " + sum);
    }
}


    
