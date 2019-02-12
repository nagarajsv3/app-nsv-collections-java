package com.nsv.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {

        Customer naga = new Customer("1","Naga","Newark");
        Customer raja = new Customer("2","Raja","Florida");
        Customer varne = new Customer("3","Naga","California");
        Customer arjun = new Customer("4","Arjun","Arizona");

        Set<Customer> customerTreeSet = new TreeSet<>();
        customerTreeSet.add(raja);
        customerTreeSet.add(naga);
        customerTreeSet.add(varne);
        customerTreeSet.add(arjun);

        System.out.println(customerTreeSet);

        Set<Customer> customerTreeSetCityComp = new TreeSet<>(new CustomerCityComparator());
        customerTreeSetCityComp.add(raja);
        customerTreeSetCityComp.add(naga);
        customerTreeSetCityComp.add(varne);
        customerTreeSetCityComp.add(arjun);

        System.out.println(customerTreeSetCityComp);



    }
}
