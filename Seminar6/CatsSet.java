/* Задание №4
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились. */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CatsSet
 */
public class CatsSet {

    public static void main(String[] args) {

        CatClass vaska = new CatClass("Peter", "Vaska", "Red", "Dvorterier", 2);
        CatClass murka = new CatClass("Ivan", "Murka", "Grey", "Siam", 1);
        CatClass barsik = new CatClass("Ivan", "Barsik", "Brown", "Sibirian", 3);
        CatClass vaska1 = new CatClass("Dima", "Vaska", "Red", "Dvorterier", 2);
        CatClass murka1 = new CatClass("Lena", "Murka", "Grey", "Siam", 1);
        CatClass barsik1 = new CatClass("Ivan", "Barsik", "Brown", "Sibirian", 3);
        CatClass vaska2 = new CatClass("Peter", "Vaska", "Red", "Dvorterier", 2);
        Set<CatClass> setCats = new HashSet<>(Arrays.asList(vaska,murka,barsik,vaska1,vaska2,murka1,barsik1));
        for (CatClass cat : setCats) {
            System.out.println(cat);
            
        }
    }
}