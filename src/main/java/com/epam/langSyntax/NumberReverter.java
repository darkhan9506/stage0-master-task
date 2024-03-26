package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        while (number > 0) {
            int i = number % 10;
            number /= 10;
            System.out.print(i);
        }
        System.out.println();
    }

}
