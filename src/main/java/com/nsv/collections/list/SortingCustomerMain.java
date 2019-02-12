package com.nsv.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomerMain {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        Customer c0 = new Customer("c0", "Naga", "Newark", 50);
        Customer c1 = new Customer("c1", "Naga", "Rehoboth", 10);
        Customer c2 = new Customer("c2", "Raja", "Grapevine", 2);
        Customer c3 = new Customer("c3", "Varnekar", "NewJersey", 3);
        Customer c4 = new Customer("c4", "Virat", "Delhi", 6);
        Customer c5 = new Customer("c5", "Rahul", "Karnataka", 100);

        customers.add(c0);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);

        System.out.println("\n****before customers sort");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Collections.sort(customers);
        System.out.println("\n****after customers sort-comparable");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("\n****after customers sort-city comparator");
        Collections.sort(customers, new CustomerCityComparator());
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("\n****after customers sort-name comparator");
        Collections.sort(customers, new CustomerNameComparator());
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("\n****after customers sort-salary comparator");
        Collections.sort(customers, new CustomerSalaryComparator());
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        System.out.println("\n****after customers sort-id comparator");
        Collections.sort(customers, new CustomerIdComparator());
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        List<Customer> customers1 = Collections.synchronizedList(customers);



        List<Customer> unmodCustomerList = getMeCustomers();
        //unmodCustomerList.add(c0);

    }

    public static List<Customer> getMeCustomers(){
        List<Customer> customers = new ArrayList<>();
        Customer c0 = new Customer("c0", "Naga", "Newark", 50);
        Customer c1 = new Customer("c1", "Naga", "Rehoboth", 10);
        Customer c2 = new Customer("c2", "Raja", "Grapevine", 2);
        Customer c3 = new Customer("c3", "Varnekar", "NewJersey", 3);
        Customer c4 = new Customer("c4", "Virat", "Delhi", 6);
        Customer c5 = new Customer("c5", "Rahul", "Karnataka", 100);
        customers.add(c0);
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        return Collections.unmodifiableList(customers);


    }
}
