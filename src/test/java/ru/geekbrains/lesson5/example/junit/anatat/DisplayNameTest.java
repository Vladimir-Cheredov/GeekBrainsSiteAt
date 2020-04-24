package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Проверка чисел")
public class DisplayNameTest {
    @DisplayName("Проверка равенства")
    @Test
    void checkEquals() {
        Assertions.assertEquals(3,1+1);
    }
}
