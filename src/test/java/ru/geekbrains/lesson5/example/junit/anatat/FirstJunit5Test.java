package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstJunit5Test {
    @Test
    void checkEquals() {
        Assertions.assertEquals(3,1+1);
    }
}
