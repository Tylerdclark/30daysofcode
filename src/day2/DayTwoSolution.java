package day2;

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

public class DayTwoSolution {


	    // Complete the solve function below.
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {
	       
	        double calculatedTip = meal_cost * tip_percent / 100;
	        double calculatedTax = meal_cost * tax_percent / 100;  
	        double totalCost = meal_cost + calculatedTip + calculatedTax;

	        //using math .round method to round to the nearest decimal
	        System.out.println(Math.round(totalCost));
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	}

}
