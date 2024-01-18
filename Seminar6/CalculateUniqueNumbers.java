/*
Задание №1
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
*/

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/** CalculateUniqueNumbers */
public class CalculateUniqueNumbers {
  public static int[] setRandomArray(int min, int max, int count) {
    Random random = new Random();
    int[] result = random.ints(min, max + 1).limit(count).toArray();
    return result;
  }

  public static float getPercentUniqueNumbers(int[] array) {
    Set<Integer> setNumbers = new HashSet<>();
    for (int el : array)
      setNumbers.add(el);
    System.out.printf(
        "Размер множества = %s%nРазмер массива = %s%n", setNumbers.size(), array.length);
    return (float) (setNumbers.size() * 100) / array.length;
  }

  public static void main(String[] args) {
    int[] array = setRandomArray(0, 2400, 1000);
    // for (int el : array)
    // System.out.printf("%s, ", el);
    System.out.printf("Процент уникальных чисел = %s%%%n", getPercentUniqueNumbers(array));
  }
}
