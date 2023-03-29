import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println(isLeapYear(2024));
        System.out.println(Arrays.toString(createArray(4,5)));
        int[] array2 = {1,1,0,0,1,0,1,1,0,0};
        System.out.println(Arrays.toString(invertArray(array2)));
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(multiArray(array3)));
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
        firstDiagonal(array);
        print(array);
        secondDiagonal(array);
        print(array);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int s = a + b;
        if (s >= 10 & s <= 20) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) return true;
        return false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        System.out.println(source.repeat(repeat));
        }


    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) return true;
        return false;
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++)
        {
            newArray[i] = initialValue;
        }
        return newArray;
    }
    private static int[] invertArray(int [] newArray) {
        int[] array = new int[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0)
                array[i] = 1;
            else if (newArray[i] == 1) array[i] = 0;
        }
        return array;
    }
/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
    private static int[] multiArray(int [] newArray) {
        int[] array = new int[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6)
                array[i] = newArray[i] * 2;
            else if (newArray[i] >= 6)
                array[i] = newArray[i];
        }
        return array;
    }

    public static void print(int[][] array) {
        System.out.println();
        for (int[] line : array) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void firstDiagonal(int[][] array) {
        int size = array[0].length;
        int j = 0;
        for (int i = 0; i < size; i++) {
            array[i][j] = 1;
            j++;
        }
    }

    public static void secondDiagonal(int[][] array) {
        int size = array[0].length;
        int j = size - 1;
        for (int i = 0; i < size; i++) {
            array[i][j] = 1;
            j--;
        }
    }
}