package ru.geekbrains.lesson5_hw;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.lesson5.Page;

public class CoursesPage {
    //        Веб-разработка
//        Разработка программ
//        Веб-дизайн
//        Мобильная разработка
//        Разработка игр
//        Информационная безопасность
//        Data Science
//        Тестирование
//        Интернет маркетинг
//        Системное администрирование
//        GeekClub
//        Киберспорт

    private final WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "[id=\"prof-link\"]")
    private WebElement topMenuProfButton;

    @FindBy(css = "[id=\"free-link\"]")
    private WebElement topMenuFreeLinkButton;

    @FindBy(css = "[id=\"cour-link\"][class=\"text-dark-dk\"]")
    private WebElement topMenuCourLinkButton;

    @FindBy(css = "[class=\"text-dark-dk\"][href=\"https://forbusiness.geekbrains.ru?utm_medium=referral&utm_source=geekbrains.ru\"]")
    private WebElement topMenuForCompanyButton;

    @FindBy(css = "[id=\"filter-0\"]")
    private WebElement checkBoxFree;

    @FindBy(css = "[id=\"filter-1\"]")
    private WebElement checkBoxForStart;

    @FindBy(css = "[id=\"filter-2\"]")
    private WebElement checkBoxWebDevel;

    @FindBy(css = "[id=\"filter-3\"]")
    private WebElement checkBoxProgramDevel;

    @FindBy(css = "[id=\"filter-4\"]")
    private WebElement checkBoxWebDesign;

    @FindBy(css = "[id=\"filter-5\"]")
    private WebElement checkBoxMobileDevel;

    @FindBy(css = "[id=\"filter-6\"]")
    private WebElement checkBoxGameDevel;

    @FindBy(css = "[id=\"filter-7\"]")
    private WebElement checkBoxInformationSecurity;

    @FindBy(css = "[id=\"filter-8\"]")
    private WebElement checkBoxDataScience;

    @FindBy(css = "[id=\"filter-9\"]")
    private WebElement checkBoxTesting;

    @FindBy(css = "[id=\"filter-10\"]")
    private WebElement checkBoxInternetMarketing;

    @FindBy(css = "[id=\"filter-11\"]")
    private WebElement checkBoxSystemAdministration;

    @FindBy(css = "[id=\"filter-12\"]")
    private WebElement checkBoxGeekClub;

    @FindBy(css = "[id=\"filter-13\"]")
    private WebElement checkBoxCyberSport;

    @Step ("Выбор пункта {nameButton} в верхней строке")
    public Page clickButtonTopMenu(String nameButton) {
        switch (nameButton) {
            case "Профессии": {
                topMenuProfButton.click();
                break;
            }
            case "Бенсплатные интенсивы": {
                topMenuFreeLinkButton.click();
                break;
            }
            case "Курсы": {
                topMenuCourLinkButton.click();
                break;
            }
            case "Компаниям": {
                topMenuForCompanyButton.click();
                break;
            }
        }
        return PageFactory.initElements(driver, Page.class);
    }

    @Step("Выбор пункта {nameButton} в checkBox")
    public CoursesPage checkBox(String nameButton) {
        switch (nameButton) {
            case "Бесплатные": {
                checkBoxFree.click();
                break;
            }
            case "Для начинающих": {
                checkBoxForStart.click();
                break;
            }
            case "Веб-разработка": {
                checkBoxWebDevel.click();
                break;
            }
            case "Разработка программ": {
                checkBoxProgramDevel.click();
                break;
            }
            case "Веб-дизайн": {
                checkBoxWebDesign.click();
                break;
            }
            case "Мобильная разработка": {
                checkBoxMobileDevel.click();
                break;
            }
            case "Разработка игр": {
                checkBoxGameDevel.click();
                break;
            }
            case "Информационная безопасность": {
                checkBoxInformationSecurity.click();
                break;
            }
            case "Data Science": {
                checkBoxDataScience.click();
                break;
            }
            case "Тестирование": {
                checkBoxTesting.click();
                break;
            }
            case "Интернет маркетинг": {
                checkBoxInternetMarketing.click();
                break;
            }
            case "Системное администрирование": {
                checkBoxSystemAdministration.click();
                break;
            }
            case "GeekClub": {
                checkBoxGeekClub.click();
                break;
            }
            case "Киберспорт": {
                checkBoxCyberSport.click();
                break;
            }
        }
        return this;
    }

    @Step("Проверка присутствия на странице текста: {text} ")
    public CoursesPage checkTextIsPresent(String text) {
        WebElement element = driver.findElement(By.partialLinkText(text));
        Assertions.assertNotNull(element.getSize());

        return this;

    }
}
