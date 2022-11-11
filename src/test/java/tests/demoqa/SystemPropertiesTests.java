package tests.demoqa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


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
        //System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
        //gradle clean one_property -Dbrowser=safari
        //safari
    }

    @Test
    @Tag("few_property_test")
    void simplePropertyTest6(){
        String browser = System.getProperty("browser", "firefox");
        String version = System.getProperty("version", "105");
        String size = System.getProperty("size", "1920x1080");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(size);
        //gradle clean few_property -Dbrowser=safari -Dversion=99.1 -Dsize=500x500
        //safari
        //99.1
        //500x500
    }

    @Test
    @Tag("hello_test")
    void simplePropertyTest7(){
        System.out.println("Hello and GoodBy " + System.getProperty("userName", "Liloops") + "!!!");
        //gradle clean hello_property -Duser_name=Qiwi
        //Hello and GoodBy Qiwi!!!
    }
}
