package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 6, 7, 2, 4, 1, 3, 5, 9, 1, 9, 55, 1, 55, 55));
        System.out.println(countValue(list));
    }

    //1. Подсчитать количество всех элементов массива и вернуть ассоциативный масиив,
    // где ключ элемент списка, значение количесвто этих элементов в списке. ПОрядок значения не имеет.

    public static Map<Integer, Integer> countValue(List<Integer> list) {

        Map<Integer, Integer> counts = new HashMap<>(); // создаем пустую HashMap

        for (int value : list) {
            if (counts.containsKey(value)) {
                counts.put(value, counts.get(value) + 1); // проходим по списку, если элемент уже встречался, извлекаем старое значение и добавляем к нему единицу
            } else {
                counts.put(value, 1); // если нет, то просто сохраняем
            }
        }
        return counts;
    }
}