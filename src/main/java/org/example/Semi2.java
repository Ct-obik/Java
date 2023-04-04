import java.util.Objects;

public class Semi2 {

    public static void main(String[] args) {
        stringEquals();
        System.out.println(compress("aaaabbbcdd")); // a4b3c1d2
        System.out.println(compress("abcda")); // abcda
        System.out.println(compress("abccccda"));
        System.out.println(compress("aaaaaaaabbbbbbb"));

//        System.out.println(isPalindrome("abcde"));
//        System.out.println(isPalindrome("abcba"));
//        System.out.println(isPalindrome("a"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, "abcde");
        stringBuilder.deleteCharAt(2); // abde
        stringBuilder.reverse(); // edba
        stringBuilder.append("_suffix"); // edba_suffix
        stringBuilder.setCharAt(0, 'x'); // xdba_suffix
        stringBuilder.insert(0, "prefix_"); // prefix_xdba_suffix
        System.out.println(stringBuilder.toString());
    }

    /**
     * Определить, является ли строка палиндромом
     *
     * abcde -> false
     * abcba -> true
     * a -> true
     */
//    static boolean isPalindrome(String source) {
//        String reversed = new StringBuilder(source).reverse().toString();
//        return Objects.equals(source, reversed);
//        int length = source.length();
//        int half = length / 2;
//        for (int i = 0; i < half; i++) {
//            if (source.charAt(i) != source.charAt(length - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
//    }

    /**
     * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
     * aaaabbbcdd -> a4b3cd2
     * abcda -> abcda
     */
    static String compress(String source) {
        int counter = 1;
        String result = "";
        result += source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i) == source.charAt(i - 1)) {
                counter++;
            } else {
                if (counter != 1) {
                    result += counter;
                }
                result += source.charAt(i);
                counter = 1;
            }
        }
        if (counter != 1) {
            result += counter;
        }
        return result;
    }

    /**
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
     *
     * (n = 6, c1='a', c2='b') -> "ababab"
     * (n = 8, c1='x', c2='y') -> "xyxyxyxy"
     */
    static String buildString(int n, char c1, char c2) {
        // TODO: 28.03.2023 Домашнее задание!
        return null;
    }

    private static void stringEquals() {
        // String Poll (String Table) ["string" == A1, "new_value" == A5]
        String s1 = "string"; // -> A1
        String s2 = "string"; // -> A1
        String s3 = new String("string"); // -> A3
        String s4 = new String("string"); // -> A4
        String s5 = null;

        s1 = s1.replace('s', 'm'); // mtring
        System.out.println(s1);

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(Objects.equals(s5, s1));
    }
}