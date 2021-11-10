package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( Subaru(56,-15));
        System.out.println( Subaru(13,0));
        System.out.println( Subaru(23,34));
        System.out.println( Subaru(45,87));
        System.out.println( Subaru(23,22));

    }
    public static String Subaru(int age,int temperature) {
        if (age > 20 && age > 45 && temperature > -20 && temperature < 30) {
            return "можно идти гулять";
        }
        if (age > 20 && temperature > -20 && temperature < 28) {
            return "Можно идти гулять";
        }else if (age > 45 && temperature >= -10 && temperature <= 20) {
            return "Можно идти гулять";
        }
        else{
            return "Оставайся дома";
        }
    }
}
