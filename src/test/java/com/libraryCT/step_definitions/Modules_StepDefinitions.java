package com.libraryCT.step_definitions;

import com.libraryCT.pages.ModulePage;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Modules_StepDefinitions {
    ModulePage modulePage = new ModulePage();


    @Then("student should see modules")
    public void student_should_see_modules(List<String> expModules) throws InterruptedException {
       //Module Books
       modulePage.booksButton.click();
       Thread.sleep(2000);
       String booksActUrl = Driver.getDriver().getCurrentUrl();
       //using string method to format our url  //Books
       String booksActUrl1 = booksActUrl.substring(36,37).toUpperCase()+booksActUrl.substring(37);
       Driver.getDriver().navigate().back();

       //Module Borrowing Books
       modulePage.borrowingBooksButton.click();
       Thread.sleep(2000);
       String bB_actualUrl = Driver.getDriver().getCurrentUrl();
       //using string method to format our url //Borrowing Books
       String bB_actualUrl2 = bB_actualUrl.substring(36,37).toUpperCase()+bB_actualUrl.substring(37,bB_actualUrl.length()-6)+" Books";

       //Creating String list and adding actual url
       List<String> actualUrl = new ArrayList<>();
       actualUrl.add(booksActUrl1);
       actualUrl.add(bB_actualUrl2);


       // verifying if we can click our expecting modules a get the right page with the url
        Assert.assertEquals(actualUrl, expModules);
        
    }


    @Then("liberian should see modules")
    public void liberian_should_see_modules(List<String> expModules) throws InterruptedException {
        //Module Books
        modulePage.booksButton.click();
        Thread.sleep(2000);
        String booksActUrl = Driver.getDriver().getCurrentUrl();
        //using string method to format our url //Books
        String booksActUrl1 = booksActUrl.substring(36,37).toUpperCase()+booksActUrl.substring(37);
        Driver.getDriver().navigate().back();

        //Module Dashboard
        modulePage.dashboardButton.click();
        Thread.sleep(2000);
        //using string method to format our url //Dashboard
        String dashboardActUrl = Driver.getDriver().getCurrentUrl();
        String dashActUrl1 = dashboardActUrl.substring(36,37).toUpperCase()+dashboardActUrl.substring(37);
        Driver.getDriver().navigate().back();

        //Module Users
        modulePage.usersButton.click();
        Thread.sleep(2000);
        //using string method to format our url //Users
        String usersActUrl = Driver.getDriver().getCurrentUrl();
        String usersActUrl1 = usersActUrl.substring(36,37).toUpperCase()+usersActUrl.substring(37);

        //Creating String List and adding actual url
        List<String> actualUrl = new ArrayList<>();
        actualUrl.add(dashActUrl1);
        actualUrl.add(usersActUrl1);
        actualUrl.add(booksActUrl1);

        // verifying if we can click our expecting modules a get the right page with the url
        Assert.assertEquals(actualUrl, expModules);

    }



}
