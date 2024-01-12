/*
📌 Напишите метод, который сжимает строку.
📌 Пример: вход aaaabbbcdd.
результат a4b3c1d2.
 */
public class StringCompression {
    public static void main(String[] args) {
        String string = "abc";
        System.out.println(string);
        System.out.println(stringCompression(string));

    }

    public static String stringCompression(String string) {
        if (string.length() == 1) return string;
        StringBuilder result = new StringBuilder(string.length());
        int count = 1;
        char currentChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == currentChar) count++;
            else {
                result.append(currentChar);
                currentChar = string.charAt(i);
                result.append(Integer.valueOf(count));
                count = 1;
            }
        }
        result.append(currentChar);
        result.append(Integer.valueOf(count));

        if (result.length() > string.length()) return string;
        return result.toString();
    }
}