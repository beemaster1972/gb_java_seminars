/*
 * Задание №0
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** task0 */
public class task0 {
  private static String[] methods = { "end", "begin", "middle" };

  private static void appendToList(List<Integer> array, Integer count, int toEnd) {
    for (Integer i = 0; i < count; i++)
      if (toEnd == 0)
        array.addLast(i);
      else if (toEnd == 1)
        array.addFirst(i);
      else
        array.add(array.size() / 2, i);
  }

  public static void main(String[] args) {
    Integer count = 10_000;
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();
    Long[] startTime = new Long[6];
    Long[] finishTime = new Long[6];
    int j = 0;
    for (int i = 0; i < 3; i++) {
      startTime[i + j] = System.currentTimeMillis();
      appendToList(arrayList, count, i);
      finishTime[i + j] = System.currentTimeMillis() - startTime[i + j];

      System.out.printf(
          "Append to %s of ArrayList %s elements took %s ms\n",
          methods[i], count, finishTime[i + j]);
      j++;
      startTime[i + j] = System.currentTimeMillis();
      appendToList(linkedList, count, i);
      finishTime[i + j] = System.currentTimeMillis() - startTime[i + j];
      System.out.printf(
          "Append to %s LinkedList %s elements took %s ms \n",
          methods[i], count, finishTime[i + j]);
    }
  }
}
