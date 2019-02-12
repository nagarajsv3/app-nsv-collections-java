package com.nsv.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomerArrayListMain {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        Customer c0 = new Customer("c1","Naga","Newark");
        Customer c1 = new Customer("c1","Naga","Newark");
        Customer c2 = new Customer("c2","Raja","Newyork");
        Customer c3 = new Customer("c3","Varnekar","NewJersey");
        Customer c4 = new Customer("c4","Virat","Delhi");
        Customer c5 = new Customer("c5","Rahul","Karnataka");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        System.out.println("****Iterate using for each****");
        for (Customer customer: customers) {
            System.out.println(customer);
        }

        System.out.println("****Iterate using Iterator Interface****");
        Iterator<Customer> iterator = customers.iterator();
        while(iterator.hasNext()){
            Customer currentCus = iterator.next();
            System.out.println(currentCus);
        }

        System.out.println("****************************");
        Iterator<Customer> customerIterator = customers.iterator();
        while(customerIterator.hasNext()){
            Customer c = customerIterator.next();
            System.out.println(c);
        }

        System.out.println("****List Iterator-Forward***********");
        ListIterator<Customer> customerListIterator = customers.listIterator();
        while(customerListIterator.hasNext()){
            Customer cust = customerListIterator.next();
            System.out.println(cust);
        }

        System.out.println("****List Iterator-Backward***********");
        ListIterator<Customer> customerListIteratorback = customers.listIterator(customers.size());
        while(customerListIteratorback.hasPrevious()){
            Customer previousCust = customerListIteratorback.previous();
            System.out.println(previousCust);
        }

        System.out.println(customers.contains(c1));
        System.out.println(customers.contains(c0));
        System.out.println(c0.equals(c1));
        System.out.println(c0.equals(c2));




    }
}
