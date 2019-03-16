package com.nsv.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMain {

    public static void main(String[] args) {


        Map<String, String> colorHashTable = new Hashtable<>();
        colorHashTable.put("S","Saffron");
        colorHashTable.put("W","White");
        colorHashTable.put("G","Green");
        //colorHashTable.put(null,"Blue");
        colorHashTable.put("O",null);


    }
}
