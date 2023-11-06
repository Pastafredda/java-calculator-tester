package model;

public class Calculator {


    public float add(float num1, float num2){
        return num1 + num2;
    }

    public float subtract (float num1, float num2){
        return num1 - num2;
    }

    public static float divide(float num1, float num2) throws IllegalArgumentException{
        if (num2==0){
            throw new IllegalArgumentException("Impossibile dividere per 0");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
