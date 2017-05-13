package com.tsixi.ddt2.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * DDT2-GM登录页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 11:20
 */
public class LoginPage {
    /**
     * 获得当前页面元素值
     *
     * @param driver driver对象
     */
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "textfield-1009-inputEl")
    @CacheLookup
    protected static WebElement NAME_INPUT;//账号输入框

    @FindBy(id = "textfield-1010-inputEl")
    @CacheLookup
    protected static WebElement PWD_INPUT;//密码输入框

    @FindBy(id = "combo-1011-trigger-picker")
    @CacheLookup
    protected static WebElement SERVER;//选择服务器

    @FindBy(css = "ul#boundlist-1018-listEl > li[data-recordindex='0']")
    @CacheLookup
    protected static WebElement TEST_SERVER;//测试服务器

    @FindBy(id = "combo-1012-trigger-picker")
    @CacheLookup
    protected static WebElement LANGUAGE;//选择语言

    @FindBy(css = "ul#boundlist-1020-listEl>li[data-recordindex='0']")
    @CacheLookup
    protected static WebElement CHINAESE;//简体中文

    @FindBy(id = "loginBtn-btnEl")
    @CacheLookup
    protected static WebElement LOGIN_BUTTON;//用户登录按钮
}