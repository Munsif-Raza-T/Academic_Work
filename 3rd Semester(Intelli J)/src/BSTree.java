public class BSTree {
    class Node {
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }
    // BST root node
    private Node root;

    // Constructor for BST =>initial empty tree
    BSTree(){
        root = null;
    }
    //delete a node from BST
    public void delete(int key) {
        root = delete_Recursive(root, key);
    }

    //recursive delete function
    public Node delete_Recursive(Node root, int key)  {
        //tree is empty
        if (root == null)  return root;

        //traverse the tree
        if (key < root.key)     //traverse left subtree
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key);
        else  {
            // node contains only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node has two children;
            //get inorder successor (min value in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }

    public int minValue(Node root)  {
        //initially minval = root
        int minval = root.key;
        //find minval
        while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // insert a node in BST
    public void insert(int key)  {
        root = insert_Recursive(root, key);
    }

    //recursive insert function
    public Node insert_Recursive(Node root, int key) {
        //tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key);
        // return pointer
        return root;
    }

    // method for inorder traversal of BST
    public void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    public void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    public boolean search(int key)  {
        Node checker = root;
        checker = search_Recursive(root, key);
        if (checker != null)
            return true;
        else
            return false;
    }

    //recursive insert function
    public Node search_Recursive(Node root, int key)  {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
            return root;
        // val is greater than root's key
        if (root.key > key)
            return search_Recursive(root.left, key);
        // val is less than root's key
        return search_Recursive(root.right, key);
    }

    public static void main(String[] args) {
        BSTree tree = new BSTree();
        tree.insert(55);
        tree.insert(56);
        tree.insert(66);
        tree.insert(77);
        tree.insert(88);
        tree.insert(99);
        tree.insert(11);
        tree.insert(22);
        tree.insert(33);
        tree.inorder();
        System.out.println();
        tree.delete(33);
        tree.delete(22);
        tree.delete(11);
        tree.delete(88);
        tree.delete(77);
        tree.inorder();
    }
}


