package com.nsv.collections.list;

import java.util.Comparator;

public class CustomerCityComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
