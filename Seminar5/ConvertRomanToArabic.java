
/*
Задание №3
Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022
*/

/*
MMXXIV = 2024
 */

import java.util.Map;
import java.util.HashMap;

public class ConvertRomanToArabic {

  public static Map<Character, Integer> getMapRomanToArabicNums() {
    Map<Character, Integer> result = new HashMap<>();
    result.put('I', 1);
    result.put('V', 5);
    result.put('X', 10);
    result.put('L', 50);
    result.put('C', 100);
    result.put('D', 500);
    result.put('M', 1000);
    return result;
  }

  public static int convertRomanToArabic(String str) {
    Map<Character, Integer> mapRomanToArabic = getMapRomanToArabicNums();
    int result = 0;
    int prevNum = 0;

    for (int i = str.length() - 1; i >= 0; i--) {
      int curNum = mapRomanToArabic.get(str.charAt(i));
      if (curNum < prevNum)
        result -= curNum;
      else
        result += curNum;
      prevNum = curNum;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(convertRomanToArabic("MMXXIV"));

  }
}
