package com.nsv.collections.stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("carrot");
        fruits.push("strawberry");

        System.out.println(fruits.peek());
        System.out.println(fruits.peek());

        System.out.println(fruits.pop());

        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.remove("banana"));
        System.out.println(fruits);
        System.out.println(fruits.remove(1));
        System.out.println(fruits);
    }
}
