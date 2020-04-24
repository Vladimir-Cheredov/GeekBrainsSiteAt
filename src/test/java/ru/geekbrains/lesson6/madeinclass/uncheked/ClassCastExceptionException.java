package ru.geekbrains.lesson6.madeinclass.uncheked;

import org.junit.jupiter.api.Test;

public class ClassCastExceptionException {
    @Test
    void name() {
        Object integer = new Integer(5);




        System.out.println((String) integer);
    }
}
