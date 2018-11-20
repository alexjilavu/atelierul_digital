package com.company;

public class Main {

    public static <T extends Comparable> boolean binarySearch(T[] list, int left, int right, Integer value) {
        if(list[0].compareTo(list[list.length - 1]) < 0)
        {
            int mid = (left + right) / 2;
            if (left > right || mid > list.length - 1)
                return false;
            if (list[mid] == value)
                return true;
            if (list[mid].compareTo(value) > 0)
                return binarySearch(list, left, mid - 1, value);
            return binarySearch(list, mid + 1, right, value);
        }
        else
        {
            int mid = (left + right) / 2;
            if (left > right || mid > list.length - 1)
                return false;
            if (list[mid] == value)
                return true;
            if (list[mid].compareTo(value) > 0)
                return binarySearch(list, mid + 1, right, value);
            return binarySearch(list, left, mid - 1, value);
        }
    }

    public static void main(String[] args) {
	    Integer[] list01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    Integer[] list02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(binarySearch(list01, 0, list01.length, -30));
        System.out.println(binarySearch(list01, 0, list02.length, -30));
        System.out.println(binarySearch(list01, 0, list01.length, 30));
        System.out.println(binarySearch(list01, 0, list02.length, 30));
        for(int i = 1; i <= 10; i++){
            System.out.println(binarySearch(list01,0, list01.length, i));
            System.out.println(binarySearch(list02,0, list02.length, i));
        }

    }
}
