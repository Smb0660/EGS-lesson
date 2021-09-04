package bubbleSort;

import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        int swap;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]){
                count++;
            }
        }
        if (count == array.length -1){
            System.out.println("Array is already sorted");
            System.out.println(Arrays.toString(array));
            System.exit(666);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j +1]){
                  swap =  array[j +1];
                  array[j +1] = array[j];
                  array[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
