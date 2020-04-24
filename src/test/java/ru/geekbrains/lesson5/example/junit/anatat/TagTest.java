package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ok")
public class TagTest {
    @Tag("NoOk")
    @Test
    void FirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Tag("Yes")
    @Test
    void SecondTest() {
        assertEquals(3, 1 + 2);
    }

    @Tag("NoYes")
    @Test
    void myThirdTest() {
        assertEquals(3, 1 + 2);
    }
}
