package day22;
import java.util.Scanner;

/**
 * @author somuc
 *
 */
public class DayTwentyTwoSolution{


	public static int getHeight(Node root){
      //Write your code here
      int leftcount=0;
      int rightcount=0;
      
      //first check the root
      if(root==null){
          return 0;
      }
      else{
    	  // left branch is always next
          if(root.left!=null){

           leftcount=getHeight(root.left)+1;
            
          }
          // next right
          if(root.right!=null){
              rightcount=getHeight(root.right)+1;
              
          }		// return the larger of the two heights
                return Math.max(leftcount,rightcount);
        }
    }
	
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }

}
