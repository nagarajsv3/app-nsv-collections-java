package com.nsv.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        System.out.println("-------LinkedList Implementation for Deque------");
        Deque<String> cricketteam = new LinkedList<>();
        cricketteam.add("Kohli");
        cricketteam.addFirst("Rohit");
        cricketteam.addLast("Bumrah");
        System.out.println(cricketteam);
        cricketteam.add("Dhoni");
        cricketteam.add("Kuldeep");
        cricketteam.add("Hardik");

        System.out.println(cricketteam.getFirst());
        System.out.println(cricketteam.getLast());
        System.out.println(cricketteam);

        cricketteam.removeFirst();
        System.out.println(cricketteam);
        cricketteam.removeLast();
        System.out.println(cricketteam);


        System.out.println("-------ArrayDeque Implementation for Deque------");
        Deque<String> cricketteamarr = new ArrayDeque<>();
        cricketteamarr.add("Kohli");
        cricketteamarr.addFirst("Rohit");
        cricketteamarr.addLast("Bumrah");
        System.out.println(cricketteamarr);
        cricketteamarr.add("Dhoni");
        cricketteamarr.add("Kuldeep");
        cricketteamarr.add("Hardik");

        System.out.println(cricketteamarr.getFirst());
        System.out.println(cricketteamarr.getLast());
        System.out.println(cricketteamarr);

        cricketteamarr.removeFirst();
        System.out.println(cricketteamarr);
        cricketteamarr.removeLast();
        System.out.println(cricketteamarr);

    }
}
