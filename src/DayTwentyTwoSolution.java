
/**
 * @author somuc
 *
 */
public class DayTwentyTwoSolution{

	public static int getHeight(Node root){
	//Write your code here
		int leftCount = 0;
		int rightCount = 0;
		if(root==null){
			return 0;
		}
		else{
		if(root.left!=null){
		leftCount = getHeight(root)+1;
		}
		if(root.right!=null){
		rightCount = getHeight(root)+1;
		}	
	}	
}
