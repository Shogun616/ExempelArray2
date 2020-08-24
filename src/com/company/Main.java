package com.company;

public class Main {

    public static void main(String[] args) {
        int heltal[] = new int[10];

        for (int n = 1; n < 10; n++){
            heltal[n] = n;
        }

        for(int n = 1; n < 10; n++){
            System.out.println("Siffra: " + heltal[n]);
        }
    }
}
