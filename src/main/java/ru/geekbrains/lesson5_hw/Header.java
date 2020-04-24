package ru.geekbrains.lesson5_hw;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.lesson5.Page;

public class Header {

    private final WebDriver driver;
    public Header(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "[id=\"top-menu\"] [class=\"show-search-form\"] svg")
    private WebElement buttonSearchHeader;

    @Step("Проверка корректности Header")
    public Page CheckHeaderPresent() {
        System.out.println("Запуск");
        Assertions.assertNotNull(buttonSearchHeader.getSize());
        return PageFactory.initElements(driver, Page.class);
    }
}
