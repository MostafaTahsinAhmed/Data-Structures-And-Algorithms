import java.util.ArrayList;
import java.util.Scanner;
public class Exersice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<BinaryTree<String>> tree = new ArrayList<>();

        System.out.println("Enter data for binary tree :");

        String[] inputs = in.nextLine().split("\\s+");

        for(String input: inputs){
            BinaryTree<String> node = new BinaryTree<>();
            node.makeRoot(input);
            tree.add(node);
        }

        for(int i=0;i<tree.size();i++){
            BinaryTree<String> cur = tree.get(i);
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < tree.size()) {
                cur.attachLeft(tree.get(leftIndex));
            }

            if(rightIndex< tree.size()){

                cur.attachRight(tree.get(rightIndex));
            }
        }

        BinaryTree<String> root =  tree.isEmpty() ? null : tree.get(0);

        System.out.printf("Height of the tree is: %d\n", BinaryTree.height(root));
        System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.nodes(root));
        System.out.println();

        System.out.print("Inorder:\t");
        BinaryTree.inorder(root);
        System.out.println();

        System.out.print("Preorder:\t");
        BinaryTree.preorder(root);
        System.out.println();

        System.out.print("Postorder:\t");
        BinaryTree.postorder(root);
        System.out.println();

        System.out.print("Level order:\t");
        BinaryTree.levelOrder(root);
        System.out.println();
    }
}



