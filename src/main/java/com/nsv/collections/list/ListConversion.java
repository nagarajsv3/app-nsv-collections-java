package com.nsv.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListConversion {

    public static void main(String[] args) {

        List<Integer> numberlist = new ArrayList<>();
        numberlist.add(1);
        numberlist.add(2);
        numberlist.add(3);

        Object[] objectarray = numberlist.toArray();
        Integer[] numberarray = new Integer[objectarray.length];
        for(int i=0;i< objectarray.length;i++){
            numberarray[i] = ((Integer)objectarray[i]);
        }

        List<Integer> integerList = Arrays.asList(numberarray);

        System.out.println(numberlist);

        for (Integer number: numberarray) {
            System.out.print(number+"\t");
        }

        System.out.println(integerList);

    }
}
