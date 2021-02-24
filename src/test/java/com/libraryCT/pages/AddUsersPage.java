package com.libraryCT.pages;

import com.github.javafaker.Faker;
import com.libraryCT.pages.base.BasePage;
import com.libraryCT.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddUsersPage extends BasePage {

       Faker faker = new Faker();
        String fullName = faker.name().fullName();
        String password = faker.internet().password();
        String email = faker.internet().emailAddress();
        String address = faker.address().fullAddress();
        String startDate = faker.date().toString();
        String endDate =faker.date().toString();

        @FindBy(xpath="//*[@id='menu_item']/li[2]/a")
        public WebElement users;
        @FindBy(xpath = "//*[@id='users']/div[1]/div[1]/span/a")
        public WebElement addUser;
        @FindBy(xpath = "//*[@id='add_user_form']/div[1]/div/div[1]/div/div/input")
        public WebElement inputFullName;
        @FindBy(xpath = "//*[@id='add_user_form']/div[1]/div/div[2]/div[1]/div/input")
        public WebElement inputPassword;
        @FindBy(xpath = "//*[@id='add_user_form']/div[1]/div/div[2]/div[2]/div/input")
        public WebElement inputEmail;
        @FindBy(xpath = "//*[@id='add_user_form']/div[2]/button[2]")
        public WebElement saveChanges;//*[@id="add_user_form"]/div[2]/button[2]
        @FindBy(xpath = "//*[@id='add_user_form']/div[2]/button[1]")
        public WebElement closeAddUser;
        @FindBy(xpath="(//*[@id='tbl_users']/tbody/tr[1]/td[1]/a)[1]")
           //*[@id="tbl_users"]/tbody/tr[1]/td[1]/a
        public WebElement editUser;
        @FindBy(xpath= "//*[@id='edit_user_form']/div[1]/div/div[1]/div/div/input")
        public WebElement changeUserName;
        @FindBy(xpath = "//*[@id='address']")
        public  WebElement inputAddress;
        @FindBy(xpath = "//*[@id='edit_user_form']/div[2]/button[2]")
        public WebElement saveEditUser;


        public void ableToAddUser(){

                users.click();
                addUser.click();
                inputFullName.sendKeys(fullName);
                inputPassword.sendKeys(password);
                inputEmail.sendKeys(email);
                inputAddress.sendKeys(address);
                saveChanges.click();

        }

        public void ableToClose(){
                users.click();
                addUser.click();
                closeAddUser.click();

        }

        public void ableToEdit(){
                users.click();
                editUser.click();
                changeUserName.clear();
                changeUserName.sendKeys(fullName);
                saveEditUser.click();

        }

        }
