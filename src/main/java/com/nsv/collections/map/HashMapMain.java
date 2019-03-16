package com.nsv.collections.map;

import com.nsv.collections.set.Customer;

import java.util.*;

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

        Map<Customer, Integer> customerMap = new HashMap<>();
        Customer naga = new Customer("1","Naga","Newark");
        Customer raja = new Customer("2","Raja","Newark");
        Customer varne = new Customer("3","Naga","Newark");
        customerMap.put(naga,1);
        customerMap.put(raja,2);
        customerMap.put(varne,3);
        System.out.println("--------------------------------------");
        System.out.println(customerMap);

        System.out.println("--------------------------------------");
        Map<String, List<Integer>> evenNumbers = new HashMap<>();
        evenNumbers.put("multiplesof2", Arrays.asList(2,4,6,8));
        Map<String, List<Integer>> oddNumbers = new HashMap<>();
        oddNumbers.put("notmultipleof2",Arrays.asList(1,3,5,7));

        for (Map.Entry<String, List<Integer>> entry: evenNumbers.entrySet()) {
            System.out.println(entry.getKey());

        }




    }
}
