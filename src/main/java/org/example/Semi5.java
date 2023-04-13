
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Semi5 {

    public static void main(String[] args) {
//        System.out.println(isIsomorphism("egg", "add")); // true
//        System.out.println(isIsomorphism("abcde", "xxxxx")); // true
//        System.out.println(isIsomorphism("abc", "efg"));  // true
//        System.out.println(isIsomorphism("paper", "title")); // true
//        System.out.println(isIsomorphism("xxxxx", "abcde")); // false

        // 1 -> s
        // 2 -> xe
        // 3 -> abc abc ppp
        // 5 -> abcde ddddd
        collectStats(List.of("abcde", "ddddd", "s", "abc", "abc", "ppp", "xe"));
    }

    /**
     * Определить, что 2 слова являются изоморфными
     * egg, add => true
     * egg, abc => false [e -> a, g -> b, g !-> c]
     * title, paper => true [t -> p, i -> a, t -> p, l -> e, e -> r]
     * abcde, xxxxx => true [a -> x, b -> x, c -> x, d -> x, e -> x]
     * xxxxx, abcde => false [x -> a, x !-> b]
     */
    public static boolean isIsomorphism(String s1, String s2) {
        int size = -1;
        if ((size = s1.length()) != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < size; i++) {
            char c1 = chars1[i];
            char c2 = chars2[i];

            Character oldValue = map.computeIfAbsent(c1, functionArg -> c2);
            if (oldValue != c2) {
                return false;
            }

//            if (map.containsKey(c1)) {
//                if (c2 != map.get(c1)) {
//                    return false;
//                }
//            }
//            map.put(c1, c2);
        }
        return true;
    }

    /**
     * Подсчитать сколько слов имеют одинаковую длину и вывести эту статистику
     * 1 -> s
     * 2 -> xe
     * 3 -> abc abc ppp
     * 5 -> abcde, ddddd
     */
    public static void collectStats(List<String> strings) {
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String string : strings) {
            int length = string.length();
            List<String> words;
            if (stats.containsKey(length)) {
                words = stats.get(length);
                words.add(string);
            } else {
                words = new ArrayList<>(List.of(string));
                stats.put(length, words);
            }
        }
        System.out.println(stats);
    }
}
