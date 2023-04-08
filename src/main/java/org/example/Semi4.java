import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Semi4 {
    public static void main(String[] args) {
        // Приложение, которое считывает от пользователя строки вида
//        text~num и сохраняет их как-то
//        если введено print~num, то нужно напечатать text и удалить его
//        string~3
//        element~10
//        java~2
//        new_element~10
//        print~2 => java
//        print~10 => new_element
//        print~10 => IndexOutOfBoundsException
//        [[string, 3], [new_element, 10], [java, 2]]
        Scanner sc = new Scanner(System.in);
        List<String[]> storage = new LinkedList<>();
        root:
        while (true) {
            String input = sc.nextLine(); // text~num
            if ("q".equals(input)) {
                break;
            }
            String[] pair = input.split("~");   // [text, num]
            if (pair.length != 2) {
                throw new IllegalArgumentException();
            }
            if ("print".equals(pair[0])) {
                boolean found = storage.removeIf(x -> {
                    if (x[1].equals(pair[1])) {
                        System.out.println(x[0]);
                        return true;
                    }
                    return false;
                });
                if (!found) {
                    throw new IndexOutOfBoundsException();
                }
//                Iterator<String[]> iterator = storage.iterator();
//                while (iterator.hasNext()) {
//                    String[] next = iterator.next();
//                    if (next[1].equals(pair[1])) {
//                        System.out.println(next[0]);
//                        iterator.remove();
//                        continue root; // go to 21
//                    }
//                }
//                throw new IndexOutOfBoundsException();
            } else {
                storage.stream()
                        .filter(next -> next[1].equals(pair[1]))
                        .findFirst()
                        .ifPresentOrElse(
                                next -> next[0] = pair[0],
                                () -> storage.add(pair)
                        );
                // в случае else можно также сократить, как с if - строка 31
//                Iterator<String[]> iterator = storage.iterator();
//                boolean found = false;
//                while (iterator.hasNext()) {
//                    String[] next = iterator.next();
//                    if (next[1].equals(pair[1])) {
//                        next[0] = pair[0];
//                        found = true;
//                        break;
//                    }
//                }
//                if (!found) {
//                    storage.add(pair);
//              }
            }
        }
    }
}
//      PS  =======================================================
//  Те части программы, которые закомментированы, решение на уроке,
//  а доступное, более сложное, для ознакомления с возможностями.
