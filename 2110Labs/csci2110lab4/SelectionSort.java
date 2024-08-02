import java.util.*;
public class SelectionSort{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int[] array = new int[input];

            for(int j=0;j<array.length;j++){
                int numbers = (int) (Math.random()* input - 1) +1;
                array[j] = numbers;
            }


            long startTime = System.currentTimeMillis();
            sort(array);
            long endtime = System.currentTimeMillis();
            long executionTime = endtime - startTime;
            System.out.println(executionTime);

    }
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int temp;
            int min =arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min){
                    min =j;
                }
                if(min !=i){
                    temp = arr[min];
                    arr[i]=temp;
                    arr[j] =arr[i];
                }
            }
        }
        return arr;
    }
}