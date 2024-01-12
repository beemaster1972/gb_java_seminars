/*
Задание №1
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
 */
import java.util.List;
import java.util.Collections; 
import java.util.Random;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class FillList {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        randomList = fillListRandom(01, 010, 010);
        System.out.println(randomList);
        Collections.sort(randomList);
        System.out.println(randomList);
            
    }

    public static ArrayList<Integer> fillListRandom(int min, int max, int count){
        return new Random().ints(min, max + 1)
                .limit(count)
                .boxed()
                .collect(Collectors.toList());
    }
}
