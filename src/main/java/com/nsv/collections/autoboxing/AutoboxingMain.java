package com.nsv.collections.autoboxing;

public class AutoboxingMain {

    public static void main(String[] args) {
        int i=10;
        Integer a = new Integer(i);

        //java 1.5
        Integer b = i; //autoboxing
        int c = a; //unboxing

        String s = "24";

        int i1 = Integer.parseInt(s);
        Integer integer = Integer.valueOf(s);

        Integer n = 3;
        String as  = n.toString();

        int n1=5;


    }
}
