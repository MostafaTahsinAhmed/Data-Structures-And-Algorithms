import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

           int input = in.nextInt();
            int[] array = new int[input];

            for (int i = 0; i < array.length; i++) {
                int numbers = (int) (Math.random() * input - 1) + 1;
                array[i] = numbers;
            }

            long startTime = System.currentTimeMillis();
            sort(array);
            long endtime = System.currentTimeMillis();
            long executionTime = endtime - startTime;
            System.out.println(executionTime);

    }

    public static int[] sort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =arr[j];
                }
            }
        }
        return arr;
    }
}
