package pages.main;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.Main;
import org.openqa.selenium.Keys;
import pages.search.SearchPage;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {
    //Тип элемента SelenideElement название searchButton
    private final SelenideElement textBoxInput = $x("//input[@type='text']");


    /**
     * Путь более эффективный, использовать его. Нужно использовать конструктор.
     * Конструктор - вызывается сразу, после создания экземпляра класса.
     * Мы никак не называем метод, т.к. это конструктор.
     * Это инициализация класса и мы при этом передаем аргумент url - это ссылка
     */
    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте и нажимается кнопка [Enter]
     * @param searchString поисковая строка
     */
    public SearchPage search(String searchString) {
        textBoxInput.setValue(searchString); //Устанавливаем значение атрибута
        textBoxInput.sendKeys(Keys.ENTER); //Нажимаем на клавишу [Enter]
        return new SearchPage();
    }

    /**
     * Метод для новичков для запуска страницы
     */
    public void openWebSite(String url) {
        Selenide.open(url);
    }




}
