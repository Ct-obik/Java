package HW;
//Реализовать приложение, которое:
//        Принимает от пользователя и запоминает строки
//        Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
//        Если введено revert, то удаляем последнюю введеную строку
//        Если введено exit, то завершаем программу
//
//        java
//        c++
//        python
//        c#
//        print
//        < [c#, python, c++, java]
//        revert
//        print
//        < [python, c++, java]
//        exit

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите данные или команду 'print', 'revert', или 'exit'): ");
            String user_input = scanner.nextLine();
            if (user_input.equals("print")) {
                Collections.reverse(lines);
                System.out.println(lines);
                Collections.reverse(lines);
            } else if (user_input.equals("revert")) {
                if (lines.size() > 0) {
                    lines.remove(lines.size() - 1);
                }
            } else if (user_input.equals("exit")) {
                break;
            } else {
                lines.add(user_input);
            }
        }
        scanner.close();
    }
}