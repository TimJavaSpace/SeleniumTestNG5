package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests {

    @Test
    public void homePageTest1(){
        System.out.println("homePageTest1");
        Assert.assertEquals(5,(2+3));
    }

    @Test
    public void ehomePageTest2(){
        System.out.println("homePageTest2");
        Assert.assertEquals(5,(2+3));
    }


}