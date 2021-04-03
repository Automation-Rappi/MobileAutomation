package com.automation.clases.pages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectMobile extends PageObject {
  protected MobileDriver mobileDriver;
  protected AndroidDriver androidDriver;
  protected AppiumDriver appiumDriver;
  protected TouchAction actions;

  public PageObjectMobile() {
    mobileDriver = getProxiedDriver();
    androidDriver = getProxiedDriver();
    appiumDriver = getProxiedDriver();
    actions = new TouchAction(mobileDriver);
  }
}
