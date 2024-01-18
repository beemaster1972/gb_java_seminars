/*
 Задание №3
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
 */

import Cat.Cat.*;

/** Cats */
public class Cats {

  public static void main(String[] args) {
    Cat vaska = new Cat("Vaska", "Brown", "Dvorterier", 1);
    Cat murka = new Cat("Murka", "Grey", "Siam", 2);
    System.out.println(vaska.printCat());
    System.out.println(murka.printCat());
  }
}
