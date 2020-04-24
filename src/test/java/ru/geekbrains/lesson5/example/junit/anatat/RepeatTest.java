package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatTest {
    @RepeatedTest(value = 10)
    void checkEquals() {
        Assertions.assertEquals(3,1+1);
    }
}
