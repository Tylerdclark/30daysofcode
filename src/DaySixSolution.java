import java.util.Scanner;

/**
 * @author Tylerdclark
 *
 */
public class DaySixSolution {
	
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++)
        words[i]=scan.next();
        scan.close();
        for(int i=0;i<n;i++) {
            String even="";
            String odd="";
            for(int j=0;j<words[i].length();j++){
            char[] array=words[i].toCharArray();
            if(j%2!=0)
            odd+=array[j];
            else
            even+=array[j];
            }
            System.out.print(even+" "+odd+"\n");
        }
    }
}
