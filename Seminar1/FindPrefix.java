/*
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
*/
public class FindPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flowight"}; // fl
        System.out.println(findPrefix(strings));
    }
    public static String findPrefix(String[] array){
        int charCount = 0;
        int stringCount = 1;
        String result = "" + array[0].charAt(charCount);
        boolean flag = true;
        while (true){
            for (int i=1; i<array.length;i++){
                if (array[i].contains(result) && (array[i].length() >= result.length())){
                    stringCount++;
                    continue;
                }
                else {
                    flag = false;
                    break;

                }
            }
            if (stringCount < array.length) break;
            if (flag) {
                charCount++;
                result += array[0].charAt(charCount);
            }
            else break;

        }
        if (stringCount<array.length) return "Нет префикса";
        return result;

    }
    static String task4_LongPrefix(String[] strs){
//        📌 Напишите метод, который находит самую длинную строку общего
//        префикса среди массива строк.
//        📌 Если общего префикса нет, вернуть пустую строку "".
//        String[] strings = {"flower", "flow", "flight"}; // fl
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return prefix;
                }
            }
        }
        return prefix;
    }
}