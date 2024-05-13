package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroToTestNGtests {


    @BeforeMethod
    public void before(){
        System.out.println("beforeMethod");
    }


    @Test
    public void HomePageTest1(){
        System.out.println("first");
        Assert.assertEquals(5,(2+3));
    }

    @Test
    public void HomePageTest1(){
        System.out.println("second");
        Assert.assertEquals(5,(2+3));
    }


}
