package com.wallethub.step_definitions;

import com.wallethub.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @Before
    public void setup() {
        Driver.getDriver().manage().window().maximize();
    }
//    @After
//    public void tearDown(){
//        Driver.getDriver().quit();
//    }
}
