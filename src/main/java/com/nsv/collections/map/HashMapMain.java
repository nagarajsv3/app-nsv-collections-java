package com.nsv.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {

        Map<String, String> colorCodes = new HashMap<>();
        colorCodes.put("R","Red");
        colorCodes.put("G","Green");
        colorCodes.put("S","Saffron");
        colorCodes.put("B","Blue");
        colorCodes.put("W","White");
        colorCodes.put("B","Black");
        System.out.println(colorCodes);
        System.out.println(colorCodes.get("S"));
        System.out.println(colorCodes.get("B"));
        System.out.println(colorCodes.size());
        colorCodes.put("B","Brown");
        System.out.println(colorCodes);
        colorCodes.remove("W");
        System.out.println(colorCodes);

        System.out.println("-----------------------------------------");
        for (Map.Entry<String, String> entry: colorCodes.entrySet()) {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        System.out.println("-----------------------------------------");

        for (Map.Entry<String, String> entry: colorCodes.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("-----------------------------------------");

    }
}
