package com.nsv.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapMain {

    public static void main(String[] args) {
        Map<String, String> weakcolorMap = new WeakHashMap<>();
        Map<String, String> strongcolorMap = new HashMap<>();
        String s1 = new String("Red");
        String s2 = new String("Red");

        weakcolorMap.put(s1,"s1");
        strongcolorMap.put(s2,"s2");

        s1 = null;
        s2 = null;

        System.gc();

        System.out.println(weakcolorMap);
        System.out.println(strongcolorMap);
    }
}
