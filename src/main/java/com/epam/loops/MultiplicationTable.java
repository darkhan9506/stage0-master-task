package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + res);
        }
    }

}
