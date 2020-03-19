package day17;

public class Calculator{
    
    
    int power(int n, int p) throws Exception {
        int result;
        
        if (n < 0|| p < 0) {
            throw new Exception("n and p should be non-negative");
        }else {
            result = (int) Math.pow(n, p);
            return result;
        }
    }
    
    
}
