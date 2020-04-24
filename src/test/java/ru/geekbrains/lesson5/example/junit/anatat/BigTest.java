package ru.geekbrains.lesson5.example.junit.anatat;

import org.junit.jupiter.api.*;
import ru.geekbrains.lesson5.example.junit.anatat.base.BaseTest;

public class BigTest extends BaseTest {
    @BeforeAll
    static void TestAll() {
        System.out.println("TestAll");
    }

    @BeforeEach
    void Test() {
        System.out.println("Test");
    }

    @Test
    void TestOne() {
        System.out.println("OK");
    }

    @Test
    void TestTwo() {
        System.out.println("OK");
    }

    @AfterEach
    void After () {
        System.out.println("After");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("AfterAll");
    }
}