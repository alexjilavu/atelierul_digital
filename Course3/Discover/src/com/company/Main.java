package com.company;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;

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
class PairDoesNotMatch extends RuntimeException{
    public PairDoesNotMatch(String ex){
        super(ex);
    }
}
class Pair <T extends ClothingItem>{
    T left;
    T right;

    public Pair(T left, T right){
        this.left = left;
        this.right = right;
        match(left, right);
    }

    private void match(T left, T right){
        if(left.getSize() != right.getSize())
            throw new PairDoesNotMatch("sizes do not match");
        if(left.getColor() != right.getColor())
            throw new PairDoesNotMatch("colors do no match");
    }
}

public class Main {
    public static void main(String[] args){
        Sock blueSock = new Sock(10, "blue");
        Sock redSock = new Sock(10, "red");
        Glove yellowGlove = new Glove(15, "yellow");
        Glove bigYellowGlove = new Glove(17, "yellow");
        //Pair socksPair01 = new Pair(blueSock, yellowGlove);
        //Pair<Sock> socksPair02 = new Pair<>(blueSock, yellowGlove);
        //Pair <Sock> socksPair03 = new Pair<>(blueSock, redSock);

        Sock left = new Sock(10, "green");
        Sock right = new Sock(10, "green");
        Pair <Sock> socksPair = new Pair<>(left, right);
    }


}
