package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class SystemPropertiesTests {
    @Test
    void simplePropertyTest1(){
        String browserName = System.getProperty("browser");
        System.out.println(browserName);

    }

    @Test
    void simplePropertyTest2(){
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simplePropertyTest3(){
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    void simplePropertyTest4(){
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property_test")
    void simplePropertyTest5(){
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }
}
