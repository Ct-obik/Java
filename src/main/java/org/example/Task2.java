package org.example;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {3,2 , 2, 3};
        shift(array, 3);
        System.out.println(Arrays.toString(array)); //[2,2,3,3]

        int[] array2 = {3, 2, 1, 3, 2, 1, 3};
        shift(array2, 3);
        System.out.println(Arrays.toString(array2)); //[2,1,2,1,3,3,3]

    }
    /**
     * Дан массив [3, 2, 2, 3] и число = 3
     * Перенести числа = 3 в конец массива: [2, 2, 3, 3]
     */
    static void shift(int[] array, int val) {
        // Второе решениес меньшим числом итераций:
        // int count = 0;
        // for (int i = 0; i < array.length; i++) {
        //    if (array[i] != val) {
        //        array[count] = array[i];
        //        count++;
        //    }
        // }
        // for (int i = count; i < array.length; i++) {
        //    array[i] = val;
        // }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                for (int j = array.length - 1; j > i ; j--) {
                    if (array[j] != val) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        break;
                    }
                }
            }
        }
    }
}
