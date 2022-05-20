package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


abstract public class BaseTest {

    public void setUp() {
        WebDriverManager.chromedriver().setup(); //Устанавливаем сетап, можем поставить gechko
        Configuration.browser = "chrome"; //браузер, который будем использовать
        Configuration.driverManagerEnabled = true; //У нас присутствует
        Configuration.browserSize = "1920x1080"; //Размер окна
        Configuration.headless = false; //будем ли мы видеть браузер в мометн выполнения, создает виртуальный экран и выполняет логику.
    }

    @Before
    public void init() {
        setUp(); //Устанавливаем сетап, можем поставить gechko
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
