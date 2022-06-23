public class BinarySearchTree {
    public Node search(Node root,int key)
    {
        if (root==null || root.key==key)
            return root;
        if (root.key < key)
            return search(root,right,key);
        return search(root,left,key);
        System.out.println("" + root.key);
        inorder(root.right);
    }
}

new*
public static void main(String[]args){
        Node root = null;

        }
