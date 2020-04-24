package ru.geekbrains.lesson5_hw;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class Page {
    public Page(WebDriver driver) {
        navigation = PageFactory.initElements(driver, Navigation.class);
        header = PageFactory.initElements(driver, Header.class);
        footer = PageFactory.initElements(driver, Footer.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        loginPage = PageFactory.initElements(driver, LogInPage.class);
        coursesPage = PageFactory.initElements(driver, CoursesPage.class);
    }

    private final Navigation navigation;
    private final Header header;
    private final Footer footer;
    private final SearchPage searchPage;
    private final LogInPage loginPage;
    private final CoursesPage coursesPage;


    @FindBy(css = "[class=\"gb-header__title\"]")
    private WebElement headerPage;

    @FindBy(css = "div button svg[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonPopUpClosed;

    @FindBy(css = "[id=\"top-menu\"] [class=\"show-search-form\"] svg")
    private WebElement buttonSearch;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;

    public Page popUpClosed() { // всплывающее
        buttonPopUpClosed.click();
        return this;
    }

    @Step("Проверка заголовка страницы: {exampleNamePage}")
    public Page checkNamePage(String exampleNamePage) {
        String headerPageText = headerPage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
        return this;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public LogInPage getLoginPage() {
        return loginPage;
    }

    public CoursesPage getCoursesPage() {
        return coursesPage;
    }

    @Step("Начало поиска по слову: {wordSearch}")
    public SearchPage startSearch(String wordSearch) {
        buttonSearch.click();
        inputSearch.sendKeys(wordSearch);
        return searchPage;


    }
}