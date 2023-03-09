package com.library.step_defs;

import com.library.pages.DashboardPage_KF;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage_KF;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class US02_StepDefs {

    UsersPage_KF usersPage_kf = new UsersPage_KF();


   @Then("Each user id should be unique")
   public void each_user_id_should_be_unique() {
       List<String> Id = new ArrayList<>();
       for (WebElement each : usersPage_kf.user_Id) {
           Id.add(each.getText());
       }

       int actualSize = Id.size();
       Set<String> uniqueId = new HashSet<>(Id);
       int size = uniqueId.size();
       Assert.assertEquals(actualSize, size);
   }


}
