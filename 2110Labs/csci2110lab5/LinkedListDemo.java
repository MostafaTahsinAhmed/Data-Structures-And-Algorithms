import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input= in.next();

        LinkedList list = new LinkedList();

        while(!input.equals("quit")){

            list.addFirst(input);
            input=in.next();
        }

        list.enumerate(); //printing the normal linkedList

        evenNUmberItems(list); //printing linkedlist which has only the even index element
        oddNUmberItems(list);   //printing linkedlist which has only the odd index element

        reverseLinkedList(list).enumerate();  //printing the reversed linkedlist
        removeMiddleNode(list);  //printing the linkedlist without the middle node
        list.enumerate();
    }

    public static void evenNUmberItems(LinkedList list){

        for(int i=0;i<list.getSize();i+=2){
            System.out.print(list.getData(i) + " ");
        }
        System.out.println();
    }



    public static void oddNUmberItems(LinkedList list){

        for(int i=1;i<list.getSize();i+=2){
            System.out.print(list.getData(i) + " ");
        }
        System.out.println();
    }

    //method for recersing the linkedlist
    public static LinkedList reverseLinkedList(LinkedList list){

        LinkedList reverse = new LinkedList();

        for(int i=0;i<list.getSize();i++){
            reverse.addFirst(list.getData(i));
        }

        return reverse;
    }

    //mehtod for removing the middle element from the linkedlist
    public static void removeMiddleNode(LinkedList list){
        if(list.getSize()==0)
            return;
        list.removeAt(list.getSize()/2);
    }
}
