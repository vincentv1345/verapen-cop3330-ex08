package org.example;

public class PrintSlices extends PizzaDivision{
    public void print(){
        getNumbers n = new getNumbers();
        PizzaDivision k = new PizzaDivision();
        int y = n.getPeople();
        int x = n.getPizzas();
        int j = n.getPizzaSlices();
        int z = k.pizzaSlices(x, j);
        int b = k.slicesPerPerson(z, y);
        int a = k.leftOverSlices(z, x);
        System.out.println(y + " people with " + x + " pizzas(" + z + " slices)");
        System.out.println("Each person gets " + b + " slices of pizza");
        System.out.println("There are " + a + " leftover pieces.");
    }
}
