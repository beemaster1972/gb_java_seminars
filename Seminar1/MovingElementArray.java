/*
* Дан массив nums = [3,2,2,3] и число val = 3.
📌    Если в массиве есть числа, равные заданному, нужно перенести
  эти элементы в конец массива.
📌    Таким образом, первые несколько (или все) элементов массива
  должны быть отличны от заданного, а остальные - равны ему.
* */

import java.util.Arrays;

public class MovingElementArray{
    public static void main(String[] args) {
        int[] array = {3,3,3,9,0,3,1,3,4,3,2,2,3,3,3};
        System.out.println(Arrays.toString(array));
        int[] res = movingElement(array,3);
        System.out.println(Arrays.toString(res));

    }
    public static int[] movingElement(int[] array, int val ){
        int left = 0;
        int right = array.length-1;
        for (;array[right]==val;) right--;
        for (; left < right;){
            if (array[right] == val){
                right--;
                continue;
            }
            if (array[left] == val){
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                //right--;
            }
            left++;
            //right--;
        }
        return array;
    }
}