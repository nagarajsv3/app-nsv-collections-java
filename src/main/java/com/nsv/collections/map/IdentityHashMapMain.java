package com.nsv.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapMain {

    public static void main(String[] args) {
        Map<String, String> colors = new IdentityHashMap<>();
        String s1 = "Red";
        String s2 = "Red";
        String s3 = new String("Red");
        String s4 = new String("Red");

        colors.put(s1,"s1");
        colors.put(s2,"s2");
        colors.put(s3,"s3");

        System.out.println(colors);

        System.out.println(colors.get(s1));
        System.out.println(colors.get(s2));
        System.out.println(colors.get(s3));
        System.out.println(colors.get(s4));

        System.out.println("IdentityHashCode="+System.identityHashCode(s1));
        System.out.println("HashCode="+s1.hashCode());
    }
}
