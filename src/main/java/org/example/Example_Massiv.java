package org.example;
import java.util.Arrays;
public class Example_Massiv {
    public static void main(String[] args) {
        arrayDemo();
    }
    private static void arrayDemo() {
        System.out.println("Hello world!");
        int[] x = {1, 2, 3, 4, 5};
        int third = x[3];
        System.out.println(third);
        x[2] = -1;
        String arrayStringPresentation = Arrays.toString(x);
        System.out.println(arrayStringPresentation);
        System.out.println(x.length);
    }
}