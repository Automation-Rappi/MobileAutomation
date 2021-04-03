# language: es

  Característica: Primer test
    Escenario: Verificación del título orientado al éxito
      Cuando ingresé a gastos y compras
      Entonces encontré el título 'Gastos de Compras'

    Escenario: Verificación del título orientado al fallo
      Cuando ingresé a gastos y compras
      Entonces encontré el título 'Gastos del Mes'