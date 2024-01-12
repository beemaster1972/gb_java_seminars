
/*
Задание №2.1
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
Задание состоит из двух блоков
Задание №2.2 (если выполнено первое задание)
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PlanetsList {

    private static String[] planetsList = {
            "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"
    };
    private static int planetsListLength = planetsList.length;
    private static int countOfList;

    public static void main(String[] args) {
        countOfList = 10;
        List<String> randomList = new ArrayList<>(countOfList);
        randomList = fillRandomPlanetList(countOfList);
        System.out.println(randomList);
        Map<String, Integer> countDuplicatePlanets = getCountPlanets(randomList);
        System.out.println(countDuplicatePlanets);

    }

    public static List<String> fillRandomPlanetList(int count) {
        List<String> result = new ArrayList<>(count);
        Random randomIndex = new Random();
        for (int i = 0; i < count; i++) {
            result.add(i, planetsList[randomIndex.nextInt(planetsListLength)]);
        }
        return result;
    }

    public static void printList(List list) {
        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public static Map<String, Integer> getCountPlanets(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        list.forEach(e -> result.put(e, result.getOrDefault(e, 0) + 1));
        return result;
    }
}
