package com.nsv.collections.set;



import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Customer implements Comparable<Customer>{
    private String id;
    private String name;
    private String city;
    private int salary;

    public Customer() {
    }

    public Customer(String id, String name, String city, int salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public Customer(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Customer o) {
        return this.getName().compareTo(o.getName());
    }
}
