package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson1 {
    static enum Colors{
        green, red, yellow, white, black
    }
    static enum Animals{
        rat, cow, tiger, hare, dragon, snake, horse, sheep, monkey, chicken, dog, pig
    }
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        Lesson2 lesson2 = new Lesson2();
        switch (C) {
            case 1 -> convertToF();
            case 2 -> checkNumbers();
            case 3 -> checkYear();
            case 4 -> checkTest();
            case 5 -> lesson2.main();
            default -> System.out.println("Wrong");
        }


    }

    public static void convertToF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write C temp:");
        int C = scanner.nextInt();
        int T = (C * 9 / 5) + 32;
        System.out.printf("T temp: %d", T);
    }

    public static void checkNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        int Num = scanner.nextInt();
        System.out.printf("Десятки: %1d,\nЕдиницы: %1d,\nСумма: %d", Num/10%10, Num%10, (Num/100 + Num/10%10 + Num%10) );
    }
    public static int nearYear(int Year){
        int nearY = 4;
        while(Year >= nearY){
            nearY += 60;
        }
        nearY -= 60;
        return nearY;
    }
    public static void checkYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write year");
        int year = scanner.nextInt();
        int nearYear = nearYear(year);

        for (Colors color : Colors.values()){
            for (Animals animal : Animals.values()){
                if (nearYear == year){
                    System.out.printf("It is year %s %s", color, animal);
                    break;
                }
            }
            nearYear+=1;
        }
    }

    public static void checkTest() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int mark = 0;
        System.out.println("Решите эти примеры:");
        for (int i = 0; i < 5; i++){
            int x = random.nextInt(11);
            int y = random.nextInt(11);
            System.out.printf("%d * %d = ", x, y);
            int Num = scanner.nextInt();
            if (Num == x*y){
                System.out.println("Правильно");
                mark+=1;
            }
            else{
                System.out.printf("Ошибка! Правильный ответ: %d \n", x*y);
            }
        }
        System.out.printf("Твоя оценка %d. ", mark);
        if (mark == 5){
            System.out.print("Ты отлично знаешь таблтцу умножения");
        }
        else{
            System.out.print("Тебе стоит повторить таблицу умножения");
        }
    }


}
