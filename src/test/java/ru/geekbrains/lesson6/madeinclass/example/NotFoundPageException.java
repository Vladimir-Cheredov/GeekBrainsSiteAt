package ru.geekbrains.lesson6.madeinclass.example;

public class NotFoundPageException extends RuntimeException{
    public NotFoundPageException() {
    }

    public NotFoundPageException(String message) {
        super(message);
    }
}
