package ru.iegs.p2_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] words = {"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii", "kkk"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Phone phBook = new Phone();

        phBook.add("Иванов", "123456");
        phBook.add("Петров", "1245234");
        phBook.add("Сидоров", "7643245758");
        phBook.add("Иванов", "378157578");
        phBook.add("Петров", "64118235");

        System.out.println("Тел" + phBook.get("Иванов"));
        System.out.println("Тел" + phBook.get("Петров"));
        System.out.println("Тел" + phBook.get("Сидоров"));

    }
}
