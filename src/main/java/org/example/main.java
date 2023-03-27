package org.example;
public class main {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(calculateMaxCount(array, 1));   // 3
        int[] array2 = {1, 1, 0, 0, 0, 1};
        System.out.println(calculateMaxCount(array2, 0));  // 2
    }
    /**
    Дан массив двоичных чисел, например [1,1,0,1,1,1]
    Вывести максимальное кол-во идущих подряд 1.
    */
    static int calculateMaxCount(int[] array, int number) {
        int count = 0;
        int maxCount = 0;
        for (int a: array) {
            if (a == number) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }

        }
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;

    }

}
