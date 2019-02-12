package com.nsv.collections.list;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
