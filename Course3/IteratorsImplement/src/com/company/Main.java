package com.company;

import java.util.List;
import java.util.ListIterator;

interface ClothingItem{
    int getSize();
    String getColor();
}

class Sock implements ClothingItem{
    private int size;
    private String color;
    Sock(int size, String color){
        this.size = size;
        this.color = color;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
}

class Glove implements ClothingItem{
    private int size;
    private String color;
    Glove(int size, String color){
        this.size = size;
        this.color = color;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
}
public class Main {

    public static void main(String[] args) {
	    Sock[] socks = new Sock[120];
	    Glove[] gloves = new Glove[120];
	    for(int i = 1; i <= 10; i++)
        {
            socks[i] = new Sock(i, "blue");
            gloves[i] = new Glove(i, "maroon");
        }
        IArrayIterator<Sock> socksIterator = new ArrayIterator<Sock>(socks);
	    while(socksIterator.hasNext()){
	        System.out.println(socksIterator.next());
	        System.out.println("Asta se afiseaza");}
	    IArrayIterator<Glove> glovesIterator = new ArrayIterator<Glove>(gloves);
	    while(glovesIterator.hasNext())
	        System.out.println(glovesIterator.next());

    }
}

interface IArrayIterator<T>{
    boolean hasNext();
    T next();
}

class ArrayIterator<T> implements IArrayIterator{
    int it;
    T[] socks;
    ArrayIterator(T[] socks){
        this.it = 1;
        this.socks = socks;
    }
    public boolean hasNext(){
        if(it <= 10) {
            this.it++;
            return true;
        }
        return false;
    }
    public T next(){
        return socks[it + 1];
    }
}
