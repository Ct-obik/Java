public class HW2 {
    public static void main(String[] args) {
        System.out.println(buildString(8, 'x', 'y'));
    }

    static String buildString(int n, char c1, char c2) {
        String string = "";
        for (int i = 0; i < n; i++) {
            string += (i % 2 == 0) ? c1 : c2;
        }
        return string;
    }
}
