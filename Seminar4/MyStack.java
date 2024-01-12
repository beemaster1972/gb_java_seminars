/*
Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */

/** MyStack */
import java.util.Arrays;

public class MyStack {
  private static int[] array;
  private static int copacity;
  private static int head;

  public static void main(String[] args) {
    copacity = 5;
    array = new int[copacity];
    head = -1;
    System.out.println(size());
    System.out.println(empty());
    push(100);
    push(200);
    push(300);
    push(400);
    push(500);
    push(600);
    System.out.println(size());
    System.out.println(empty());
    System.out.println(Arrays.toString(array));
    System.out.println(peek());
    System.out.println(pop());
    System.out.println(size());
    System.out.println(peek());
  }

  public static int size() {
    return head != -1 ? head + 1 : 0;
  }

  public static boolean empty() {
    return head == -1;
  }

  public static void push(int element) {
    if (head < copacity - 1)
      array[++head] = element;
  }

  public static int peek() {
    return array[head];
  }

  public static int pop() {
    return array[head--];
  }
}
