public class BinaryTree {
    Object root;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public boolean isFull(){
        if(root == null) return true;
        if(left == null && right == null) return true;
        if(left != null && right != null) return (left.isFull() && right.isFull());
        return false;
    }

    public int size(){
        if(left == null && right == null) return 1;
        if(left != null) return  1+left.size();
        if(right != null) return 1+right.size();
        return 1 + left.size() + right.size();
    }

    public boolean isLeaf(){
        if(left == null && right == null)
            return true;
        else
            return false;
    }

    public int height(){
        if(root == null) return -1;
        int lefts = 0, rights = 0;
        if(left != null)
            lefts = 1+left.height();
        if(right != null)
            rights = 1 + right.height();
        return lefts > rights ? lefts : rights;
    }

    public boolean isComplete(int index, int number_nodes)
    {
        // An empty tree is complete
        if (root == null)
            return true;

        // If index assigned to current node is more than
        // number of nodes in tree, then tree is not complete
        if (index >= number_nodes)
            return false;

        // Recur for left and right subtrees
        return (left.isComplete(2 * index + 1, number_nodes)
                && right.isComplete(2 * index + 2, number_nodes));

    }

    public int isBalanced()
    {
        if (root == null)
        {
            return 0;
        }

        // checking left subtree
        int leftSubtreeHeight = left.isBalanced();
        if (leftSubtreeHeight == -1) return -1;
        // if left subtree is not balanced then the entire tree is also not balanced

        //checking right subtree
        int rightSubtreeHeight = right.isBalanced();
        if (rightSubtreeHeight == -1) return -1;
        // if right subtree is not balanced then the entire          tree is also not balanced

        //checking the difference of left and right subtree for current node
        if (Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1)
        {
            return -1;
        }
        //if it is balanced then return the height
        return (Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1);
    }

    public int getLeafCount()
    {
        if (root == null)
            return 0;
        if (left == null && right == null)
            return 1;
        else
            return left.getLeafCount() + right.getLeafCount();
    }

    int getLevelUtil(int data, int level)
    {
        if (root == null)
            return 0;

        if (data == data)
            return level;

        int downlevel
                = getLevelUtil(data, level + 1);
        if (downlevel != 0)
            return downlevel;

        downlevel
                = getLevelUtil(data, level + 1);
        return downlevel;
    }

    /* Returns level of given data value */
    int getLevel(int data)
    {
        return getLevelUtil(data, 1);
    }

    public boolean contains(Object object){
        if(root == object) return true;
        boolean contain = false;
        if(left != null){
            if(left.toString().contains(object.toString())) return true;
            contain = left.contains(object);
        }
        if(right != null){
            if(right.toString().contains(object.toString())) return true;
            contain = right.contains(object);
        }

        return contain;
    }

    public String toString(){
        StringBuffer string = new StringBuffer("");
        if(left != null) string.append(left+",");
        string.append(root);
        if(right != null) string.append("," +right);

        return string + "";
    }

    public String preOrder(){
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append(root);
        if (left != null) stringBuffer.append(left.preOrder());
        if(right != null) stringBuffer.append(right.preOrder());

        return stringBuffer + "";
    }

    public String postOrder(){
        StringBuffer string = new StringBuffer("");
        if (left != null) string.append(left.postOrder());
        if(right != null) string.append(right.postOrder());
        string.append(root);

        return string + "";
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree("A",new BinaryTree("B",new BinaryTree("D"),new BinaryTree("E")),new BinaryTree("C",new BinaryTree("F"),new BinaryTree("G")));
        System.out.println("In-order: " + root.toString());
        System.out.println("Pre-order: " +root.preOrder());
        System.out.println("Post-order: " +root.postOrder());
        System.out.println(root.getLeafCount());
        System.out.println(root.getLevel(0));
    }
}
