package ru.geekbrains.lesson2;

public class HomeWorkAppTwo {
    public static void main(String[] args) {

        System.out.println(check(5,6));
        comparison(5);
        System.out.println(compare(4));
        printTextNTimes("Moscow",5);
        System.out.println(years(2024));


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

        public static boolean compare(int a) {

        if (a < 0) {
            return true;
        } else {
            return false;
        }}

        public static void printTextNTimes (String word, int n) {
        for (int a =0; a < n;a++ ){
            System.out.println(word);
        }}


        public static boolean years (int a) {
        if (a % 4 == 0) {
            if (a % 400 == 0){
                return true;
                } else if (a % 100 == 0) {
                return false;
               } else {
                return true;
              }} else {
            return false;
            }}


      }


