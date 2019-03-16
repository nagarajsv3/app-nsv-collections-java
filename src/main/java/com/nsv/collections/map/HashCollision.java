package com.nsv.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashCollision {

    public static void main(String[] args) {

        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("abcdef",1);
        stringMap.put("abcdfG",2);
        stringMap.put("abcdfH",3);
        stringMap.put("a",4);
        stringMap.put("b",5);
        stringMap.put("c",6);
        stringMap.put("d",7);
        stringMap.put("e",8);
        stringMap.put("f",9);
        stringMap.put("g",10);
        stringMap.put("h",11);
        stringMap.put("i",12);
        stringMap.put("j",13);
        stringMap.put("k",14);
        stringMap.put("l",15);


    }
}
