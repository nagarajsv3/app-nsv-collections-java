package com.nsv.collections.failfastfailsafeiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListModificationMain {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Blue");

/*        for (String color: colors) {
            colors.add("Red");
        }*/

        /*Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            colors.add("Red");
        }*/

        /*for (String color: colors) {
            colors.remove("Black");
        }*/

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String color = iterator.next();
            if(color.equalsIgnoreCase("Black")){
                iterator.remove();
            }
        }

        for (String color: colors) {
            System.out.println(color);
        }

    }
}
