import java.util.ArrayList;

public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> parent;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	public BinaryTree() {
		parent = left = right = null;
		data = null;
	}

	public void makeRoot(T data) {
		if (!isEmpty()) {
			System.out.println("Can't make root. Already exists");
		} else
			this.data = data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setLeft(BinaryTree<T> tree) {
		left = tree;
	}

	public void setRight(BinaryTree<T> tree) {
		right = tree;
	}

	public void setParent(BinaryTree<T> tree) {
		parent = tree;
	}

	public T getData() {
		return data;
	}

	public BinaryTree<T> getParent() {
		return parent;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void attachLeft(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (left != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setLeft(tree);
		}
	}

	public void attachRight(BinaryTree<T> tree) {
		if (tree == null)
			return;
		else if (right != null || tree.getParent() != null) {
			System.out.println("Can't attach");
			return;
		} else {
			tree.setParent(this);
			this.setRight(tree);
		}
	}

	public BinaryTree<T> detachLeft() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retLeft = left;
		left = null;
		if (retLeft != null)
			retLeft.setParent(null);
		return retLeft;
	}

	public BinaryTree<T> detachRight() {
		if (this.isEmpty())
			return null;
		BinaryTree<T> retRight = right;
		right = null;
		if (retRight != null)
			retRight.setParent(null);
		return retRight;
	}

	public boolean isEmpty() {
		if (data == null)
			return true;
		else
			return false;
	}

	public void clear() {
		left = right = parent = null;
		data = null;
	}

	public BinaryTree<T> root() {
		if (parent == null)
			return this;
		else {
			BinaryTree<T> next = parent;
			while (next.getParent() != null)
				next = next.getParent();
			return next;
		}
	}

	// this method returns the number of nodes/trees in a BinaryTree
	public static <T> int nodes(BinaryTree<T> t) {
		if(t==null){
			return 0;
		}
		return 1 + nodes(t.getLeft()) + nodes(t.getRight());

	}

	// this method returns the height of a BinaryTree
	// (the number of edges separating a root node/tree from its most distant,
	// descendant leaf)
	public static <T> int height(BinaryTree<T> t) {
		if(t==null) {
			return -1;
		}
		return 1+ Math.max(height(t.getLeft()),height(t.getRight()));
	}

	// this method tests whether a tree is height balanced
	public static <T> boolean heightBalanced(BinaryTree<T> t) {
		if(t==null){
			return true;
		}
		int leftheight = height(t.getLeft());
		int rightheight = height(t.getRight());

		if(Math.abs(leftheight - rightheight) <=1 && heightBalanced(t.getLeft()) && heightBalanced(t.getRight())){
			return true;
		}
		return false;
	}

	public static <T> void preorder(BinaryTree<T> t) {
		if (t != null) {
			System.out.print(t.getData() + "\t");
			preorder(t.getLeft());
			preorder(t.getRight());
		}
	}

	public static <T> void inorder(BinaryTree<T> t) {
		if (t != null) {
			inorder(t.getLeft());
			System.out.print(t.getData() + "\t");
			inorder(t.getRight());
		}
	}

	public static <T> void postorder(BinaryTree<T> t) {
		if (t != null) {
			postorder(t.getLeft());
			postorder(t.getRight());
			System.out.print(t.getData() + "\t");
		}
	}

	// this method uses a modified BFS to print the data associated with all
	// nodes/trees in level order
	public static <T> void levelOrder(BinaryTree<T> t) {

		if(t ==null){
			return;
		}

		ArrayList<BinaryTree<T>> list = new ArrayList<>();
		list.add(t);

		while(!list.isEmpty()){
			BinaryTree<T> cur = list.remove(0);
			System.out.print(cur.getData() + "\t");

			if(cur.getLeft() !=null){
				list.add(cur.getLeft());
			}

			if(cur.getRight() != null){
				list.add(cur.getRight());
			}
		}
	}
}
