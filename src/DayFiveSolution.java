import java.util.Scanner;
/**
 * @author somuc
 *
 */
public class DayFiveSolution {
	    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i;
        for(i=1; i<=10; i++)
    {
        int result = n * i;
        System.out.println(n+ " x " +i+ " = " +result);
    } 
        scanner.close();
        
    }
}

