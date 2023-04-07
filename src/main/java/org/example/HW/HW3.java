package HW;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW3 {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>(List.of(1,2,3,6,8,12,33,4,1,0,8));
        ArrayList<Integer> numberList1 = new ArrayList<Integer>(numberList);
        System.out.println(numberList);
        removeEvenNumber(numberList);
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        numbers.removeIf(s -> (s % 2) == 0);
        System.out.println(numbers);
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            try {
                Integer.parseInt(next);
                iter.remove();
            } catch (NumberFormatException e) {

            }
        }
    }
}
