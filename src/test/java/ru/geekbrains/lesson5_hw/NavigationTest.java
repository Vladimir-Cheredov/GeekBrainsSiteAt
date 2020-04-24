package ru.geekbrains.lesson5_hw;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.lesson5_hw.base.BaseTest;

import java.util.stream.Stream;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Проверка элементов навигации sidebar страницы https://geekbrains.ru/career")
public class NavigationTest extends BaseTest {


    static Stream<String> stringProvider() {
        return Stream.of("Курсы", "Вебинары", "Форум", "Блог", "Тесты", "Карьера");
    }
    @Description(value = "1. Перейти на сайт https://geekbrains.ru/courses\n" + "2. Нажать на кнопку навигации")
    @DisplayName("Нажатие в навигации")
    @ParameterizedTest(name = "{index} => переход на страницу {0}")
    @MethodSource("stringProvider")
    void checkNavigation(String namePage) {
        driver.get("https://geekbrains.ru/career");

        PageFactory.initElements(driver, Page.class)
                .getNavigation().clickButton(namePage)
                .checkNamePage(namePage).
                getHeader().
                CheckHeaderPresent().
                getFooter().
                CheckFooterPresent();
    }
}