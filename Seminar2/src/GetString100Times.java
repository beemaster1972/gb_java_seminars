public class GetString100Times {
    public static String getString100Times(String string, int repetitions, String delimiter){
        StringBuilder result = new StringBuilder(repetitions*string.length());
        for (int i=0;i<repetitions;i++){
            result.append(string);
            result.append(delimiter);
        }
        return result.toString();
    }
}
