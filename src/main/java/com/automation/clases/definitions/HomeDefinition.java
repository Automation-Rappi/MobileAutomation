package com.automation.clases.definitions;

import com.automation.clases.steps.HomeStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class HomeDefinition {

  @Steps HomeStep homeStep;

  @Cuando("ingresé a gastos y compras")
  public void start() {
    homeStep.start();
  }

  @Entonces("encontré el título {string}")
  public void checkTitle(String title) {
    homeStep.checkTitle(title);
  }
}
