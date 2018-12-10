package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int numberOfPhilofers = 5;
        List<Philosofer> philosofers = new ArrayList<>();
        List<Chopstick> chopsticks = new ArrayList<>();

        for(int i = 0; i < numberOfPhilofers; i++)
            chopsticks.add(new Chopstick());

        for(int i = 0; i < numberOfPhilofers; i++)
        {
            Chopstick left = chopsticks.get();
            Chopstick right = chopsticks.get((i + 1) % numberOfPhilofers);
            philosofers.add(new Philosofer("P" + (i + 1), left, right))
        }
    }

    static class Philosofer{
        private String id;
        private Chopstick left, right;

        public Philosofer(String id, Chopstick left, Chopstick right)
        {
            super(id);
            this.id = id;
            this.left = left;
            this.right = right;

        }
        public void run(){
            while(true){
                synchronized (left) {
                    synchronized (right) {
                        eat();
                        rest();

                    }
                }
            }
        }
        public void eat(){}
        public void rest(){}

    }
    static class Chopstick{

    }
}
