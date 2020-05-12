package day16;

import java.util.Scanner;

/**
 * @author somuc
 *
 */
public class DaySixteenSolution {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int stringInt;
        try {
            
            stringInt= Integer.parseInt(S);
            System.out.println(stringInt);
            
        } catch (NumberFormatException e) {
            
            System.out.println("Bad String");
        }
}
}
