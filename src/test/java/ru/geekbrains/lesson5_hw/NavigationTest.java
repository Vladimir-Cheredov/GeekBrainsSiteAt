package ru.geekbrains.lesson5_hw;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.lesson5_hw.base.BaseTest;

import java.util.stream.Stream;

@DisplayName("Проверка элементов навигации sidebar страницы https://geekbrains.ru/career")
public class NavigationTest extends BaseTest {

    static Stream<String> stringProvider() {
        return Stream.of("Курсы", "Вебинары", "Форум", "Блог", "Тесты", "Карьера");
    }

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