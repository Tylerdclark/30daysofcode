import java.util.Scanner;
/**
 * @author somuc
 *
 */
public class DayFiveSolution {
	
  

  public static void main(String[] args) {
	int doubleAmount = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter starting DNA");
    int dna = scan.nextInt();
    System.out.println("DNA count:" + dna);
    System.out.println("Please enter how many times you want it to double");
    int rounds = scan.nextInt();
    System.out.println("Round count:" + rounds);
    for (int i = 0; i < rounds; i++) {
        doubleAmount += dna;
        System.out.println(doubleAmount);
      }
    
    scan.close();
  }
	
}
