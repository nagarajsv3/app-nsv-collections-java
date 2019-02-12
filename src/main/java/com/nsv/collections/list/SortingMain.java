package com.nsv.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("red");
        colors.add("blue");

        Iterator<String> colorsiterator = colors.iterator();
        while(colorsiterator.hasNext()){
            System.out.println(colorsiterator.next());
        }

        Collections.sort(colors);

        System.out.println("*****after sorting*****");
        for (String color: colors) {
            System.out.println(color);
        }

        Collections.sort(colors, Collections.<String>reverseOrder());
        System.out.println("*****after reverse sorting*****");
        for (String color: colors) {
            System.out.println(color);
        }


    }
}
