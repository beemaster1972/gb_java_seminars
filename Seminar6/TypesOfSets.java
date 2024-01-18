/*
 Задание №0
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/** TypesOfSets */
public class TypesOfSets {

  public static void main(String[] args) {
    var hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
    var linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
    var treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
    System.out.println(hashSet);
    System.out.println(linkedHashSet);
    System.out.println(treeSet);
  }
}
