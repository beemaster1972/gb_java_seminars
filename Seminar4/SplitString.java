
/*
 Задание №1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка. SplitString
 */
import java.util.LinkedList;
import java.util.Scanner;

public class SplitString {

  private static LinkedList<String> textList = new LinkedList<>();

  public static void main(String[] args) {
    String[] result = new String[2];
    String text = "";
    int num = -1;
    Scanner scanner = new java.util.Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      System.out.println("Введите строку вида text~num для добавления элемента в список");
      System.out.println("print~num для вывода и удаления элемента");
      System.out.println("для завершения программы введите end~num");
      String rawData = scanner.nextLine();
      result = getElement(rawData);
      text = result[0];
      num = Integer.parseInt(result[1]);
      switch (text) {
        case "print":
          if (num >= 0 && num < textList.size()) {
            System.out.println();
            System.out.println(textList.get(num));
            textList.remove(num);
          }
          break;
        case "end":
          exit = true;
          break;

        default:
          if (num >= 0 && num <= textList.size()) {
            textList.add(num, text);
            System.out.printf("Added %s to postion %s %n", text, num);
          } else if (num > textList.size()) {
            textList.add(text);
            System.out.printf("Added %s to the end %n", text);
          } else if (num < 0)
            System.out.println("Num must be positive or 0");
          break;
      }
    }
  }

  private static String[] getElement(String rawData) {
    String[] data = rawData.split("~");
    return data;
  }
}
