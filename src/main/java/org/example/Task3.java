package org.example;
public class Task3 {
    public static void main(String[] args) {
        System.out.println(getCommonPrefix(new String[]{"aaab", "aacc", "aacd"}));
        System.out.println(getCommonPrefix(new String[]{"abc", "abd", "cde"}));
        System.out.println(getCommonPrefix(new String[]{"aaaaa", "aaaaa", "aaaaacde"}));
        String s = "abcde";
        char[] chars = s.toCharArray();
    }
        /**
         * Напишите метод, который находит самую длинную строку общего
         * префикса среди массива строк.
         * Если общего префикса нет, вернуть пустую строку "".
         * ["aaab", "aacc", "aacd"] -> "aa"
         * ["abc", "abd", "cde"] -> ""
         * ["aaaaa", "aaaaa", "aaaaacde"] -> "aaaaa"
         */
        static String getCommonPrefix(String[] array) {
            String commonPrefix = array[0];
            for (int i = 1; i < array.length; i++) {
                String second = array[i];
                int minLength = Math.min(commonPrefix.length(), second.length());
                for (int j = 0; j < minLength; j++) {
                    if (commonPrefix.charAt(j) != second.charAt(j)) {
                        commonPrefix = commonPrefix.substring(0, j);
                        break;
                    }
                }
            }
            return commonPrefix;
        }
    }

