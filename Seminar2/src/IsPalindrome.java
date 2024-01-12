public class IsPalindrome {
    public static void main(String[] args) {
        String string = "А роза упала на лапу Азора";
        System.out.println(string);
        long start = System.currentTimeMillis();
        System.out.println(isPalindrome(string));
        System.out.println(System.currentTimeMillis()-start);
        start = System.currentTimeMillis();
        System.out.println(isPalindromeSimple(string));
        System.out.println(System.currentTimeMillis()-start);

    }

    public static boolean isPalindrome(String string) {
        boolean result = false;
        string = string.replaceAll("\\s+", "");
        StringBuilder compareString = new StringBuilder(string);
        compareString = compareString.reverse();
        String newString = compareString.toString();
        result = newString.equalsIgnoreCase(string);
        return result;

    }

    public static boolean isPalindromeSimple(String string) {
        String str = string.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}