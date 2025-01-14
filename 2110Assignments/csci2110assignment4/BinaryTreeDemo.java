public class BinaryTreeDemo {
	public static void main(String[] args) {

		BinaryTree<String> A = new BinaryTree<String>();
		BinaryTree<String> B = new BinaryTree<String>();
		BinaryTree<String> C = new BinaryTree<String>();
		BinaryTree<String> D = new BinaryTree<String>();
		BinaryTree<String> E = new BinaryTree<String>();
		BinaryTree<String> F = new BinaryTree<String>();
		BinaryTree<String> G = new BinaryTree<String>();

		A.makeRoot("one");
		B.makeRoot("two");
		C.makeRoot("three");
		D.makeRoot("four");
		E.makeRoot("five");
		F.makeRoot("Six");
		G.makeRoot("seven");

		A.attachLeft(B);
		A.attachRight(C);
		B.attachLeft(D);
		B.attachRight(E);
		D.attachLeft(F);
		D.attachRight(G);

		// test statements
		System.out.printf("Height of the tree is: %d\n", BinaryTree.height(A));

		System.out.printf("Number of nodes in the tree is: %d\n", BinaryTree.nodes(A));

		System.out.println();

		System.out.print("Inorder:\t");
		BinaryTree.inorder(A);
		System.out.println();

		System.out.print("Preorder:\t");
		BinaryTree.preorder(A);
		System.out.println();

		System.out.print("Postorder:\t");
		BinaryTree.postorder(A);
		System.out.println();

		System.out.print("Level order:\t");
		BinaryTree.levelOrder(A);
		System.out.println();
		System.out.println();

		System.out.printf("And is it height balanced... %s\n", BinaryTree.heightBalanced(A) ? "Yes!" : "No.");

		System.out.println();
	}
}
