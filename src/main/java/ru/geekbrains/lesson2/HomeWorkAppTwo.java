package ru.geekbrains.lesson2;

public class HomeWorkAppTwo {
    public static void main(String[] args) {

        check(5,6);
        comparison(5);
        comparisonboolean(4);
        printTextNTimes("Moscow",5);

    }

        public static boolean check(int a, int b) {
        int sum = a+b;
        if (sum >= 10 && sum <=20){
            return true;
        } else {
            return false;
        }}

        public static void comparison(int a ) {
        if (a >= 0) {
            System.out.println("Введенное число - Положительное");
        } else {
            System.out.println("Ввведенное число - Отрицательное");
        }}

        public static boolean comparisonboolean (int a) {

        if (a < 0) {
            return true;
        } else {
            return false;
        }}

        public static void printTextNTimes (String word, int n) {
        for (int a =0; a < n;a++ ){
            System.out.println(word);
        }}



      }


