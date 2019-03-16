package com.nsv.collections.map;

import com.nsv.collections.set.Customer;
import com.nsv.collections.set.CustomerCityComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {

        System.out.println("Sort using Customer Comparable");
        Map<Customer, Integer> customerTreeMap = new TreeMap<>();
        Customer naga = new Customer("1","Naga","Newark");
        Customer raja = new Customer("2","Raja","Newark");
        Customer varne = new Customer("3","Naga","Newark");
        Customer jsm = new Customer("4","Naresh","Alaska");
        Customer baba = new Customer("5","Narendra","Alabama");
        customerTreeMap.put(naga,1);
        customerTreeMap.put(raja,2);
        customerTreeMap.put(varne,3);
        customerTreeMap.put(jsm,4);
        customerTreeMap.put(baba,5);
        System.out.println("------------------------------");
        for (Map.Entry<Customer,Integer> entry: customerTreeMap.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("------------------------------");

        System.out.println("Sort using Customer City Comparator");
        Map<Customer, Integer> customerTreeMapUsingComparator = new TreeMap<>(new CustomerCityComparator());
        customerTreeMapUsingComparator.put(naga,1);
        customerTreeMapUsingComparator.put(raja,2);
        customerTreeMapUsingComparator.put(varne,3);
        customerTreeMapUsingComparator.put(jsm,4);
        customerTreeMapUsingComparator.put(baba,5);
        System.out.println("------------------------------");
        for (Map.Entry<Customer,Integer> entry: customerTreeMapUsingComparator.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }





    }
}
