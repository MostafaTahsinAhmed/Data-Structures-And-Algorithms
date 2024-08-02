import java.util.Scanner;
public class GenericStackDemo {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        GenericStack<String> strings = new GenericStack<>();
        GenericStack<Integer> integers = new GenericStack<>();

        String input = in.next();
        while(!input.equals("quit")){

            strings.push(input);
             input = in.next();
        }


        int intInput = in.nextInt();
        while(intInput!=-1){

            integers.push(intInput);
             intInput = in.nextInt();
        }

        System.out.println("String Stack Contents: ");
        for(int i=0;!strings.isEmpty();i++){
            System.out.println(strings.pop());
        }

        System.out.println();

        System.out.println("Integer Stack Contents: ");
        for(int i=0;!integers.isEmpty();i++){
            System.out.println(integers.pop());

        }
    }
}
