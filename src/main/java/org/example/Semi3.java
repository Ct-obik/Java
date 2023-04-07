import java.util.*;

public class Semi3 {
    public static void main(String[] args){
        List<String> text = new ArrayList<>();
        text.add("word");
        text.add("Sun");
        text.add("Moon");
        text.add("Sun");
        text.add("word");
        text.add("Word");
        text.add("java");
        text.add("java");
        text.add("java");
        text.add("python");
        text.add("c");
        text.add("c#");
        text.add("php");
        countAndPrint(text);
        //removeAndDuplicate(text);
        System.out.println(text);
        removeStringThatShortenThen(text, 4);
        System.out.println(text);
    }
    static void countAndPrint(List<String> strings) {
        // подсчитать слова с повторениями
        // распечатать статистику слов с повторенями
        String temp;
        int count;
        List<String> tempList = new ArrayList<>();
        for ( int i = 0; i < strings.size(); i++) {
            temp = strings.get(i);
            if (!tempList.contains(temp)) {
                count = 0;
                for (int j = 0; j < strings.size(); j++) {
                    if (temp.equals((strings.get(j)))) {
                        count++;
                    }
                }
                System.out.println(temp + " " + count);
                tempList.add(temp);
            }
        }
    }
    static void removeAndDuplicate(List<String> strings) {
        // удалить из списка дубликаты
        /*  Collections.sort(strings);
        String first = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).equals(first)) {
                strings.remove(i);
                i--;
            } else {
                first = strings.get(i);
            }
        }   */
        // Второй вариант с итератором:
        Collections.sort(strings);
        Iterator<String> iterator = strings.iterator();
        String first = iterator.next();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(first)) {
                iterator.remove();
            } else {
                first = next;
            }
        }
    }
    static void removeStringThatShortenThen(List<String> strings, int criticalLength) {
        // Удалить из списка все строки, которые короче, чем criticalLength
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() < criticalLength) {
                iterator.remove();
            }
        }
    }
}
