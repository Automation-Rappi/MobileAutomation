package com.automation.clases.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends PageObjectMobile {

  private static final Logger LOGGER = LoggerFactory.getLogger(PageObjectMobile.class);

  @FindBy(id = "mic.app.gastosdecompras:id/buttonStart")
  WebElementFacade btnStart;

  @FindBy(id = "mic.app.gastosdecompras:id/textTitle")
  WebElementFacade lblTitle;

  public void selectStart() {
    try {
      btnStart.click();
    } catch (NoSuchElementException | TimeoutException e) {
      LOGGER.error(e.getMessage());
    }
  }

  public String getTitle() {
    return lblTitle.getText();
  }
}
