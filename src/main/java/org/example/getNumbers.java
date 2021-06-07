package org.example;
import java.util.Scanner;
public class getNumbers {
    public int getPeople(){
        System.out.println( "How many people? " );
        Scanner z = new Scanner(System.in);
        int person = z.nextInt();
        return person;
    }
    public int getPizzas(){
        System.out.println("How many pizzas do you have? ");
        Scanner p = new Scanner(System.in);
        int pizza = p.nextInt();
        return pizza;
    }
    public int getPizzaSlices(){
        System.out.println("How many slices per pizza? ");
        Scanner s = new Scanner(System.in);
        int slice = s.nextInt();
        return slice;
    }

}
