package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class HW3 {
    public static void main(String[] args) {
        HW1();
        HW2();
    }

    /*1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)*/
    public static void HW1() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(64, 68, 100, 5, 2, 1, 2));

        numbers.removeIf(number -> number % 2 == 0);

        System.out.println(numbers);
        System.out.println();
    }

    /*  2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/
    private static int sum(ArrayList<Integer> ArrayList) {

        double sum = 0;
        for (Integer integer : ArrayList) sum += integer;
        return (int) sum;
    }
    public static void HW2() {

        ArrayList<Integer> ArrayList = new ArrayList<>(Arrays.asList(7, 2, 1, 1, 100));
        System.out.println("Максимальное число: " + Collections.max(ArrayList));
        System.out.println("Минимальное число: " + Collections.min(ArrayList));
        System.out.println("Среднее арифмитическое: " + (double)sum(ArrayList) / ArrayList.size());
    }
}

