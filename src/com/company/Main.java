package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Lesson1 \n2 - Lesson2");
        int C = scanner.nextInt();
        Lesson1 lesson1 = new Lesson1();
        Lesson2 lesson2 = new Lesson2();
        switch (C) {
            case 1 -> lesson1.main();
            case 2 -> lesson2.main();
            default -> System.out.println("Wrong");
        }
    }
}