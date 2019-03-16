package com.nsv.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {

        Queue<String> fruits = new LinkedList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.offer("banana");
        fruits.offer("carrot");

        System.out.println(fruits.peek());
        System.out.println(fruits);
        System.out.println(fruits.element());
        System.out.println(fruits);
        System.out.println("-------------------");
        System.out.println(fruits.poll());
        System.out.println(fruits);
        System.out.println(fruits.remove());
        System.out.println(fruits);


        Queue<Patient> patientq = new PriorityQueue<>(new PatientComparator());
        Patient p1 = new Patient(1,"Patient1",false);
        Patient p2 = new Patient(2,"Patient2",true);
        Patient p3 = new Patient(3,"Patient3",true);
        Patient p4 = new Patient(4,"Patient4",false);
        Patient p5 = new Patient(5,"Patient5",true);
        Patient p6 = new Patient(6,"Patient6",false);

        patientq.offer(p1);
        System.out.println(patientq);
        patientq.offer(p2);
        System.out.println(patientq);
        patientq.add(p3);
        System.out.println(patientq);
        patientq.offer(p4);
        System.out.println(patientq);
        patientq.offer(p5);
        System.out.println(patientq);
        patientq.offer(p6);

        System.out.println("-------------------------------------------");
        System.out.println(patientq);



    }
}
