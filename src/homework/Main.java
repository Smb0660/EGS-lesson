package homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Factorial factorial = new Factorial();
        // factorial.factorial(6,7);
        //RepeatingElement repeatingElement = new RepeatingElement();
        //repeatingElement.repeatingElement(new int[]{1, 4, 4, 5, 6, 2, 1, 4, 2});
        //Sequence_by_1 sequence_by_1 = new Sequence_by_1();
        //sequence_by_1.sequence(new int[]{3, 2, 3, 4, 2, 2, 4, 5, 6, 70, 8, 9,10, 1, 1,5,4,8,9});
        //Sequence sequence = new Sequence();
        //sequence.sequence(new int[]{1, 8, 5, 4, 4, 7, 9, 10,500,1});
        //Matrix matrix = new Matrix();
        //matrix.matrix();
        // NegativeSequence negativeSequence = new NegativeSequence();
        //negativeSequence.negativeSeq(new int[]{2, -5, 4, 5, -4, -3, -1, -1, 4, 5, 7, 8});

    }
}
// Homework 3-rd task :
class Factorial {

    public void factorial(int n, int k) {
        if (k > n) {
            System.out.println("k must be less than n");
            System.exit(666);
        }
        int factN = 1;
        int factK = 1;
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        for (int i = 1; i <= k; i++) {
            factK *= i;
        }
        int number = k - n;
        int factNumber = 1;
        for (int i = 1; i <= number; i++) {
            factNumber *= i;
        }
        System.out.println(factN * factK / factNumber);
    }
}
// Homework 2 task
class RepeatingElement {
    public void repeatingElement(int[] arr) {
        int element = 0, max_count = 1, count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else {
                if (count > max_count) {
                    max_count = count;
                    element = arr[i - 1];
                }
                count = 1;
            }
        }
        System.out.println(element + ": " + max_count + " times");
    }
}

class Sequence_by_1 {
    public void sequence(int[] array) {
        int tempCount = 0, count = 1;
        ArrayList tempArray = new ArrayList<>();
        ArrayList arr = new ArrayList();
        boolean a = true;
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                a = false;
            }

            if (array[i] - array[i - 1] != 1 && a && array[i + 1] - array[i] != 1) {
                tempArray.clear();
                tempCount = 0;
            } else if (array[i] - array[i - 1] == 1) {
                tempCount++;
                tempArray.add(array[i]);
                //   System.out.println(tempArray);
            } else if (a && array[i + 1] - array[i] == 1) {
                tempCount++;
                tempArray.add(array[i]);
            }

            if (tempCount >= count) {
                count = tempCount;
                arr = (ArrayList) tempArray.clone();

            }
        }
        System.out.println(arr + " by length " + count);
    }
}

class Sequence {
    public void sequence(int[] array) {
        int tempCount = 0, count = 1;
        ArrayList tempArray = new ArrayList<>();
        ArrayList arr = new ArrayList();
        boolean a = true;
        for (int i = 1; i < array.length; i++) {
            if (i == array.length - 1) {
                a = false;
            }
            if (array[i] <= array[i - 1] && a && array[i + 1] <= array[i]) {
                tempArray.clear();
                tempCount = 0;
            } else if (array[i] > array[i - 1]) {
                tempCount++;
                tempArray.add(array[i]);
                //   System.out.println(tempArray);
            } else if (a && array[i + 1] > array[i]) {
                tempCount++;
                tempArray.add(array[i]);
            }

            if (tempCount >= count) {
                count = tempCount;
                arr = (ArrayList) tempArray.clone();

            }
        }
        System.out.println(arr + " by length " + tempCount);
    }
}

class Matrix {
    public void matrix() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int input = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input;
                input++;
            }
        }
        for (int[] matrixShow : matrix) {
            for (int print : matrixShow) {
                System.out.print(print + " ");
            }
            System.out.println(" ");
        }

    }
}

class NegativeSequence {
    public void negativeSeq(int[] array) {
        int tempCount = 0, count = 0;
        ArrayList tempArray = new ArrayList<>();
        ArrayList arr = new ArrayList();
        int arthur[] = new int[tempArray.size()];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                tempCount++;
                tempArray.add(array[i]);
            } else {

                tempArray.clear();
                tempCount = 0;
            }
            if (tempCount >= count) {
                count = tempCount;
                arr = (ArrayList) tempArray.clone();

            }

        }
        System.out.println(arr + " by length" + count);
    }
}










