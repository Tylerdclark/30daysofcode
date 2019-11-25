import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * @author somuc
 *
 */
public class DayTenSolution {
	
//this code produces a base ten version of the 
//number of consectutive 1's 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String binaryString= "";
 
        int max = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        binaryString = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) != '0')
                count = count +1;
                 else{
                     count = 0;
                     continue;
                 }
                 if(count> max)
                 max = count;
             }
             System.out.println(max);
    
        scanner.close();
    }
}


