package com.library.step_defs;


import com.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


//    @Before   // it should come from cucumber java, NOT FROM JUNIT
//    public void setUp(){
//        System.out.println("SET UP BEFORE EACH SCENARIO");
//    }



    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }


}
