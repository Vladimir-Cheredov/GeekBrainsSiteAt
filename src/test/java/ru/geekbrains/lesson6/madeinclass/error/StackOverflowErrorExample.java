package ru.geekbrains.lesson6.madeinclass.error;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        example();
    }

    public static void example(){
        example();
    }
}
