package com.nsv.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("red");

        Set<String> linkedcolorsset = new LinkedHashSet<>();
        linkedcolorsset.add("red");

        System.out.println(colors.size());
        System.out.println(colors);
        for (String color: colors) {
            System.out.println(color);
        }
        colors.remove("red");
        System.out.println(colors);

        Customer naga = new Customer("1","Naga","Newark");
        Customer raja = new Customer("2","Raja","Newark");
        Customer varne = new Customer("3","Naga","Newark");

        Set<Customer> customersSet = new HashSet<>();
        customersSet.add(naga);
        customersSet.add(raja);
        customersSet.add(varne);
        customersSet.add(naga);

        System.out.println(customersSet.size());
        System.out.println(customersSet);
        System.out.println("naga".hashCode());
        System.out.println(Objects.hash("naga"));
        System.out.println("raja".hashCode());
        System.out.println("varne".hashCode());
        System.out.println(naga.hashCode());
        System.out.println(raja.hashCode());
        System.out.println(varne.hashCode());

    }
}
