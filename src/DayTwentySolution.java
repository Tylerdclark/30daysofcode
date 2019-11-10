import java.util.Scanner;

/**
 * @author somuc
 *
 */
public class DayTwentySolution {
	
	void bubbleSort(int arr[]) 
    { 
        int numSwaps = 0;
        int n = arr.length;
        
        
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    numSwaps++;
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
        System.out.println("Array is sorted in " + numSwaps + " swaps." );
        System.out.println("First Element: " + arr[ 0 ]);
        System.out.println("Last Element: " + arr[ arr.length - 1 ]);
    } 
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        
        new DayTwentySolution().bubbleSort( a );
        
        in.close();
    }
}
