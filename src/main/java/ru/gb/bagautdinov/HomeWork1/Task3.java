package ru.gb.bagautdinov.HomeWork1;

public class Task3 {
    public static void checkSumSign() {
        int a = 5;
        int b = 9;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void main(String[] args) {
        checkSumSign();
    }
}
