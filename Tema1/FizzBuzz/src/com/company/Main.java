package com.company;

public class Main {

    public static void main(String[] args) {
	    int i, ok = 0;
	    for(i = 1; i <= 100; i++)
        {
            ok = 0;
            if(i % 3 == 0)
            {
                System.out.print("Fizz ");
                ok = 1;
            }
            if(i % 5 == 0)
            {
                System.out.print("Buzz ");
                ok = 1;
            }
            if(i % 7 == 0)
            {
                System.out.print("Foo ");
                ok = 1;
            }
            if(i % 11 == 0)
            {
                System.out.print("Bar ");
                ok = 1;
            }
            if(ok == 0)
                System.out.print(i + ", ");
            else
                System.out.print(",");
        }
    }
}
