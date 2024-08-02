import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exersice3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        GenericStack<StudentRecord> stack1 = new GenericStack<>();
        GenericStack<String> stack2 = new GenericStack<>();


        System.out.println("Enter the filename to read from: ");
        String filename = in.nextLine();
        File file = new File(filename);

        Scanner reader = new Scanner(file);

        StringTokenizer token;

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            token = new StringTokenizer(line, " ");
            String firstName = token.nextToken();
            String lastName = token.nextToken();
            String IDString = token.nextToken();

            Integer IDNum = Integer.valueOf(IDString);

            StudentRecord obj = new StudentRecord(firstName, lastName, IDNum);

            stack1.push(obj);
        }
        reader.close();


        while(!stack1.isEmpty()){
            StudentRecord objects = stack1.pop();
            stack2.push(objects.getLastName());
        }

        for(int i=0;!stack2.isEmpty();i++){
            System.out.println(stack2.pop());
        }
    }
}




