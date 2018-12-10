package com.company;

import java.util.Random;

public class Main {

    static class Player{
        String option;
        Player() {
            String[] arr = {"rock", "paper", "scrissors"};
            Random random = new Random();
            int select = random.nextInt(arr.length);
            this.option = arr[select];
        }
    }

    private static void printWinner(Player p1, Player p2)
    {
        String o1 = p1.option;
        String o2 = p2.option;
        if(o1.equals(o2)){
            System.out.println(o1 + " vs " + o2 + " => EQUALITY");
        } else if((o1.equals("paper") && o2.equals("rock")) ||
                (o1.equals("rock") && o2.equals("scrissors")) ||
                (o1.equals("scrissors") && o2.equals("paper")))
        {
            System.out.println(o1 + " vs " + o2 + " => P1 WINS");
        }
            else
                System.out.println(o1 + " VS " + o2 + " => P2 WINS");

    }
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        printWinner(p1, p2);


    }
}
