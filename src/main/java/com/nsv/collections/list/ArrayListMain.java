package com.nsv.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");

        System.out.println("get element using index"+colors.get(0));
        System.out.println("size "+colors.size());

        System.out.println("***print before removing****");
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println("***remove***");
        colors.remove(1);
        System.out.println("***print after removing****");
        for (String color: colors) {
            System.out.println(color);
        }

        colors.add(1,"blue");
        colors.add("blue");
        colors.add("white");
        System.out.println("***print after setting****");
        for (String color: colors) {
            System.out.println(color);
        }
        colors.set(1,"red");
        System.out.println("***final print after setting****");
        for (String color: colors) {
            System.out.println(color);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        List<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        System.out.println(characters);
    }
}
