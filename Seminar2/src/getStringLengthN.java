
public class getStringLengthN {
    public static void main(String[] args) {
        char char1 = 'a', char2 = 'b';
        int N = 100;
        String string = getStringLenN(N, char1, char2);
        System.out.printf("%s имеет длину %d",string, string.length());

    }
    public static String getStringLenN(int N, Character c1, Character c2){
        if ((N % 2) == 1) return "Не чётная длина строки!";
        StringBuilder result = new StringBuilder(N);

        for (int i=0;i<N/2;i++) result.append(c1).append(c2);
        return result.toString();
    }
}