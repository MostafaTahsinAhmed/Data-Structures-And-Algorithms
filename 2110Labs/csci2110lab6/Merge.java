import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Merge {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in= new Scanner(System.in);
        Random value = new Random();

        ArrayList<String> list = new ArrayList<>();
        OrderedList<String> list1 = new OrderedList<>();
        OrderedList<String> list2 = new OrderedList<>();

        String fileName = in.next();
        File file = new File(fileName);

        Scanner reader = new Scanner(file);

        while(reader.hasNext()){
            String name = reader.next();
            list.add(name);
        }
        reader.close();

        int list1Number = value.nextInt(1500-1000)+1000;
        for(int i=0;i<list1Number;i++){
            list1.add(list.get(i));
        }

        int list2Number = value.nextInt(1500-1000)+1000;
        for(int i=0;i<list2Number;i++){
            list2.add(list.get(i));
        }


        OrderedList<String> mergedList = merge(list1, list2);
        saveListToFile(mergedList, "merged.txt");

        OrderedList<String> commonList = common(list1, list2);
        saveListToFile(commonList, "common.txt");


        OrderedList<String> differenceList = difference(list1, list2);
        saveListToFile(differenceList, "difference.txt");


    }
    public static <T extends Comparable<T>> OrderedList<T> merge(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> merged = new OrderedList<>();

        int i = 0, j = 0;

        // While both lists have elements left
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                merged.add(list1.get(i));
                i++;
            } else if (list2.get(j).compareTo(list1.get(i)) < 0) {
                merged.add(list2.get(j));
                j++;
            } else {
                merged.add(list1.get(i));
                i++;
                j++;
            }
        }

        // If list1 has elements left
        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        // If list2 has elements left
        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }



    public static <T extends Comparable<T>> OrderedList<T> common(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> commonList = new OrderedList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                i++;
            } else if (list1.get(i).compareTo(list2.get(j)) > 0) {
                j++;
            } else {
                commonList.add(list1.get(i));
                i++;
                j++;
            }
        }

        return commonList;
    }


    public static <T extends Comparable<T>> OrderedList<T> difference(OrderedList<T> list1, OrderedList<T> list2) {
        OrderedList<T> differenceList = new OrderedList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                differenceList.add(list1.get(i));
                i++;
            } else if (list1.get(i).compareTo(list2.get(j)) > 0) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        while (i < list1.size()) {
            differenceList.add(list1.get(i));
            i++;
        }

        return differenceList;

    }

    public static void saveListToFile(OrderedList<String> list, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i).toString() + "\n");
            }
        } catch (IOException e) {
        }
    }

}



