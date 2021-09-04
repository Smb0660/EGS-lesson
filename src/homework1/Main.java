package homework1;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        RepeatElement repeatElement = new RepeatElement();
//        repeatElement.repeatElement(new int[]{1,1,6, 7, 6, 2, 3, 4, 4, 1,9});
//          MissingElement missingElement = new MissingElement();
//          missingElement.findMissingElement(new int[]{1, 2, 3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20,21,22,23,24,25,26
//          ,27,28,29,30,
//          31,32,33,34,35,36,37,38,39,40});
//        SumZero sumZero = new SumZero();
//        sumZero.sumZero(new int[]{2, 3, -6, -1, -9, -1, 6, 3, -8, 8});
        QuickSort quickSort = new QuickSort();
        int[] array = new int[]{6,33,8,45,48,6,9,20};
       quickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
//class RepeatElement{
//    public void repeatElement(int[] array){
//        ArrayList arrayWithoutRepeatElements = new ArrayList();
//        arrayWithoutRepeatElements.add(array[0]);
//        for (int i = 1; i < array.length; i++) {
//              if (arrayWithoutRepeatElements.contains(array[i])){
//                continue;
//              } else arrayWithoutRepeatElements.add(array[i]);
//        }
//        System.out.println(arrayWithoutRepeatElements);
//        }
//    }

//class MissingElement{
//    public void findMissingElement(int[] array){
//        if (array[0] != 1){
//            System.out.println("Missing number is 1 ");
//            System.exit(0);
//        }
//        if (array[array.length-1] != 40){
//            System.out.println("Missing number is 40");
//            System.exit(0);
//        }
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] - array[i -1] != 1){
//                System.out.println("Missing number is " + (array[i] - 1));
//            }
//        }
//    }
//}
//class SumZero {
//    public void sumZero(int[] array) {
//        ArrayList arrayList = new ArrayList();
//        int sum;
//        for (int i = 0; i < array.length; i++) {
//            sum = 0;
//            arrayList.clear();
//            for (int j = i + 1; j < array.length; j++) {
//               sum += array[j];
//               arrayList.add(array[j]);
//              if (sum == 0){
//                  System.out.println( arrayList);
//              }
//
//            }
//        }
//    }
//}

class QuickSort{
        public static int divide(int[] array, int firstIndex, int lastIndex) {
            int pivot = array[lastIndex];
            int i = firstIndex - 1;
            for (int j = firstIndex; j < lastIndex; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[lastIndex];
            array[lastIndex] = temp;
            return i + 1;               //Divide Index
        }
        public static void quickSort(int[] array, int firstIndex, int lastIndex) {
            if (firstIndex <= lastIndex) {
                int divideIndex = divide(array, firstIndex, lastIndex);
                quickSort(array, firstIndex, divideIndex - 1);
                quickSort(array, divideIndex + 1, lastIndex);
            }
        }


        }



