
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/construct-string-from-binary-tree/
public class Tree2Str {
	StringBuilder res;
	    public String tree2str(TreeNode t) {
	        if(t == null)
	            return "";
	        res = new StringBuilder();
	        tree2strUtil(t);
	        String resStr = res.toString();
	        resStr = resStr.substring(1,resStr.length()-1);
	        return resStr;
	    }
	    
	    public void tree2strUtil(TreeNode t){
	        if(t == null)
	            return;
	        res.append("(");
	        res.append(t.val);
	        if(t.left == null && t.right != null){
	            res.append("()");
	        }
	        tree2strUtil(t.left);
	        tree2strUtil(t.right);
	        res.append(")");
	    }
}
