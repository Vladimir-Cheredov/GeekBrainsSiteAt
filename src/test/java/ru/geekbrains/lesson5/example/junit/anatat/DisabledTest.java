package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {
    @Disabled(value = "Не выполняется")
    @Test
    void checkEquals() {
        Assertions.assertEquals(2, 1 + 1);
    }
}
