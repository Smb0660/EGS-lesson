package selectionSort;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,8,2,3,4,66,8};
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
        }
        System.out.println(Arrays.toString(array));
    }
}

