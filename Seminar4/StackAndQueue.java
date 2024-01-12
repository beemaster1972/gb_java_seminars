
/*
 1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Stack<Integer> stack = getStack(array);
    Queue<Integer> queue = getQueue(array);
    System.out.println(stack);
    while (stack.size() > 0) {
      System.out.printf("%s ", stack.pop());
    }
    System.out.println();
    System.out.println(queue);
  }

  public static Stack<Integer> getStack(int[] array) {
    Stack<Integer> result = new Stack<>();
    for (int i = 0; i < array.length; i++) {
      result.push(array[i]);
    }
    return result;
  }

  public static Queue<Integer> getQueue(int[] array) {
    Queue<Integer> result = new ArrayDeque<>();
    for (int i = 0; i < array.length; i++) {
      result.add(array[i]);
    }
    return result;
  }
}
