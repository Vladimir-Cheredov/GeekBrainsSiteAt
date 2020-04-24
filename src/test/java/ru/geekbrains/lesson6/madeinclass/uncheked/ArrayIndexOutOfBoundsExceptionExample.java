package ru.geekbrains.lesson6.madeinclass.uncheked;

import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionExample {
    @Test
    void name() {
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
