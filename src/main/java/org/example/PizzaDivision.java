package org.example;

public class PizzaDivision extends getNumbers{
    public int pizzaSlices(int a, int b){
        int totalSlices = a * b;
        return totalSlices;
    }
    public int slicesPerPerson(int a, int b)
    {
        int slicePer = a / b;
        return slicePer;
    }
    public int leftOverSlices(int a, int b){
        int leftOver = a % b;
        return leftOver;
    }
}
