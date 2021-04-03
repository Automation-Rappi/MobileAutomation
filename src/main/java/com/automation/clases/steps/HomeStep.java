package com.automation.clases.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.automation.clases.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeStep {

  @Page HomePage homePage;

  @Step
  public void start() {
    homePage.selectStart();
  }

  @Step
  public void checkTitle(String title) {
    assertThat(title).as("El titulo no coincide").isEqualTo(homePage.getTitle());
  }
}
