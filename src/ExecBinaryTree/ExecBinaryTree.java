package ExecBinaryTree;

import com.sun.source.tree.BinaryTree;
import org.w3c.dom.Node;

public class ExecBinaryTree{
    public  static  void main(String[] args){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node (item: 1);
        tree.root.left = new Node (item: 2);
        tree.root.right = new Node(item: 3);
        tree.root.left.left = new Node(item: 4)
    }
}
