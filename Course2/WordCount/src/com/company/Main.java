package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = null;
        Map<String,Integer> words_count = new HashMap<String,Integer>();
        try{
            sc = new Scanner(new BufferedReader(new FileReader("date.txt")));
            while (sc.hasNextLine()) {
                String[] words = sc.nextLine().split("\\s");
                for (int i = 0; i < words.length; i++) {
                    words[i].replace(",", "");
                    words[i].replace(".", "");
                    words[i].replace("?", "");
                    words[i].replace("'","");
                    words[i].replace("!","");
                    words[i].replace("\n", "");
                    words[i] = words[i].toLowerCase();
                    String s = words[i];
                    if(words_count.keySet().contains(s))
                    {
                        Integer count = words_count.get(s) + 1;
                        words_count.put(s, count);
                    }
                    else
                        words_count.put(s, 1);
                }
            }
        }catch (IOException ex){
            System.out.println("EROARE");
        }
        Object[] a = words_count.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        int i = 0;
        for (Object e : a) {
            i++;
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
            if(i == 10)
                return ;
    }
}}
