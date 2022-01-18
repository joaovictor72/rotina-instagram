package automatizado.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class Base implements IBase  {
    protected WebDriver driver;

    private String usuario;
    private String senha;

    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setup() throws IOException {
        String OS = System.getProperty("os.name", "generic").toLowerCase();

        String geckoDriver;
        if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
            geckoDriver = "geckodriver-macos";
        } else if (OS.indexOf("win") >= 0) {
            geckoDriver = "geckodriver-window.exe";
        } else if (OS.indexOf("nux") >= 0) {
            geckoDriver = "geckodriver-linux";
        } else {
            geckoDriver = "";
        }
        Path path = FileSystems.getDefault().getPath("src/main/resources/geckodriver/" + geckoDriver);
        System.setProperty("webdriver.gecko.driver", path.toString());
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        login();
        esperarDezSegundos();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    public void login() {
        driver.manage().window().maximize();
        esperarCincoSegundos();
        driver.get(getBaseUrl());
        esperarCincoSegundos();
        driver.findElement(By.name("username")).clear();
        esperarCincoSegundos();
        driver.findElement(By.name("username")).sendKeys(getUsuario());
        esperarCincoSegundos();
        driver.findElement(By.name("password")).clear();
        esperarCincoSegundos();
        driver.findElement(By.name("password")).sendKeys(getSenha());
        esperarCincoSegundos();
        WebElement webElement = driver.findElement(By.cssSelector(".L3NKy"));
        esperarCincoSegundos();
        webElement.sendKeys(Keys.ENTER);
        esperarDezSegundos();
    }


    public static void esperarDezSegundos() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void esperarCincoSegundos() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void esperarDoisSegundos() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    }



