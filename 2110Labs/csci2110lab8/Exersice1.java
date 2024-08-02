import java.util.Scanner;
public class Exersice1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter int or '0' : ");
        int input = in.nextInt();

        BinarySearchTree<Integer> list = new BinarySearchTree<>();

        while (input != 0) {
            list.insert(input);

            System.out.print("Enter int or '0' : ");
            input = in.nextInt();
        }

        System.out.println("The max data value in the BST is: " + list.findMax());
        System.out.println("The min data value in the BST is: " + list.findMin());
        System.out.print("What key would you like to search for? ");

        int find = in.nextInt();
        BinaryTree<Integer> node = list.recursiveSearch(find);

        if (node != null) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}