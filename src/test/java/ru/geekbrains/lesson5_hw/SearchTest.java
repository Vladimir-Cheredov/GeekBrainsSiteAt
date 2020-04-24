package ru.geekbrains.lesson5_hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.lesson5_hw.base.BaseTest;

@DisplayName("Проверка результатов поиска по ключевому слову Java")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SearchTest extends BaseTest {
    @Test
    void SearchJavaTest() {
        driver.get("https://geekbrains.ru/career");

        PageFactory.initElements(driver, Page.class).
                startSearch("java").
                checkTitleNumberGreaterThanOrEqualTo("Профессии", 1).
                checkTitleNumberGreaterThanOrEqualTo("Курсы", 15).
                checkTitleNumberGreaterThanOrEqualTo("Вебинары", 180).
                checkTitleNumberGreaterThanOrEqualTo("Блоги", 300).
                checkTitleNumberGreaterThanOrEqualTo("Форумы", 300).
                checkTitleNumberGreaterThanOrEqualTo("Тесты", 1).
                checkCompanyIsPresent("Образовательный портал GeekBrains");


    }
}