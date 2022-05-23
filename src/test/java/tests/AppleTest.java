package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.main.MainPage;
import pages.search.SearchPage;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru/"; //Незименная переменная, только пользоваться
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-13";

    @Test
    public void checkHrefArticle() {
        //MainPage - тип переменной, т.к. это класс мы создаем new MainPage
        //Т.е. мы создали экземлпяр класса MainPage
        //MainPage mainPage = new MainPage(BASE_URL); //сразу откроется ссылка, т.к. есть конструктор
        //SearchPage searchPage = new SearchPage(); //нет конструктора, поэтому не передаем атрибут, в котором сразу при создании что-то выполняем
        //String href = searchPage.getHrefFromFirstArticle(); //наша переменная будет содержать ссылку
        //Assert.assertTrue(href.contains("iphone-13"));
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD)); //идеальное сокращение теста в 1 строку, построение длинной цепочки

    }


}
