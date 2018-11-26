package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static boolean isLeader(ArrayList<Integer> arr, int curentIndex) {
        Integer curentNumber = arr.get(curentIndex);
        for (int j = curentIndex; j < arr.size(); j++)
            if (curentNumber < arr.get(j))
                return false;
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(20);
        arr.add(15);
        arr.add(10);
        arr.add(8);
        arr.add(12);
        for (int i = 0; i < arr.size(); i++)
            if(isLeader(arr, i) == true)
                System.out.println(arr.get(i));


        }
    }
