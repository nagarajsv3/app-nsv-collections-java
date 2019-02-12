package com.nsv.collections.list;

import java.util.Comparator;

public class CustomerSalaryComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSalary()-o2.getSalary();
    }
}
