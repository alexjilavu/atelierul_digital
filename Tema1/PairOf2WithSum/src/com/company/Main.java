package com.company;

import java.util.HashSet;

public class Main {

    public static void findPairs(int arr[], int sum){
        HashSet<Integer> comp = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            if(comp.contains(sum - arr[i]))
                System.out.println(arr[i] + " " + (sum - arr[i]));
            else
                comp.add(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, -3, -2, 3, 0};
        findPairs(arr, 0);

    }
}
