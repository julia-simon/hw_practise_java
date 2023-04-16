package com.simon;

public class Main {
    public static void main(String[] args) {
        int a = 10000;
        int b = -1000;
        int c = 9;
        int im = Integer.MAX_VALUE;
        short s = Short.MAX_VALUE;
        float f = 1.5f;
        double d = 10.8;


        System.out.println("При сложении a и b получим результат " + (a + b));
        System.out.println("При вычитании a и b получим результат " + (a - b));
        System.out.println("При умножении a и b получим результат " + (a * b));
        System.out.println("При делении a и b получим результат " + (a / b));
        System.out.println("Остаток от деления a и f равен " + (a % f));
        System.out.println("Остаток от деления a и d равен " + (a % d));
        System.out.println("При сложении a и d получим результат " + (a + d));
        System.out.println("При вычитании a и d получим результат " + (a - d));
        System.out.println("При умножении a и d получим результат " + (a * d));
        System.out.println("Перевыполнение данных получим при сложении im и a, результат " + (im + a));
        System.out.println("Перевыполнение данных получим при сложении s и a, результат" + (short)(s + a));
        if (a > b) {
            System.out.println("Первое число больше второго");
        }
        else {
            System.out.println("Первое число меньше второго");
        }
        if (c < 10 || c > 18) {
            System.out.println("Закрыто");
        }
        else {
            System.out.println("Открыто");

    }


    }
}