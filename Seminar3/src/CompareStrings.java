/*
Задание №0
Даны следующие строки, cравнить их с помощью == и
метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
*/
public class CompareStrings {
    public static boolean compareStringsAsObject(Object s1, Object s2) {
        return s1.equals(s2);
    }

    public static boolean compareStrings(Object s1, Object s2) {
        return s1 == s2;
    }

    public static void printResultCompare(Object s1, Object s2) {
        String templateString = "(\"%s\" == \"%s\") = %s\n";
        String templateObject = "\"%s\".equals(\"%s\") = %s\n";
        System.out.printf(templateString, s1, s2, compareStrings(s1, s2));
        System.out.printf(templateObject, s1, s2, compareStringsAsObject(s1, s2));

    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        printResultCompare(s1, s2);
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        printResultCompare(s3, s4);
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        printResultCompare(s5, s6);
    }

}
