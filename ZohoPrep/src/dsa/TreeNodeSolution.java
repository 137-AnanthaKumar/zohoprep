package dsa;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
public class TreeNodeSolution {
 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);
        
        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);
        TreeNodeSolution sol=new TreeNodeSolution();

        System.out.println(sol.isSame(p1,q1));

    }

    private boolean isSame(TreeNode p1, TreeNode q1) {
        
        if(p1==null && q1==null) {
            return true;
        }
        
        if(p1==null || q1==null) {
            return false;

        }
        
        if(p1.val!=q1.val) {
            return false;
        }
        
        
        
        // TODO Auto-generated method stub
        return isSame(p1.left,q1.left) && isSame(p1.right,q1.right);
    }
    
    

}
