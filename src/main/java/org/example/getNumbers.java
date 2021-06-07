package org.example;
import java.util.Scanner;
public class getNumbers {
    public int getPeople(){
        System.out.println( "How many people? " );
        Scanner z = new Scanner(System.in);
        return z.nextInt();
    }
    public int getPizzas(){
        System.out.println("How many pizzas do you have? ");
        Scanner p = new Scanner(System.in);
        return p.nextInt();
    }
    public int getPizzaSlices(){
        System.out.println("How many slices per pizza? ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

}
