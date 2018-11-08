package com.company;

import java.util.HashSet;

public class Main {
    public static int findPairOf3(int arr[])
    {
        int numberOfPairs = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            HashSet<Integer> comp = new HashSet<Integer>();
            for(int j = i + 1; j < arr.length; j++)
                if(comp.contains(-(arr[i] + arr[j])))
                    numberOfPairs++;
                else
                    comp.add(arr[j]);
        }
        return numberOfPairs;

    }

    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 1, 1};
        System.out.println(findPairOf3(arr));
    }
}
