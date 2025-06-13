package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
  
  @Autowired
  private CurrencyServiceConfiguration currencyServiceConfiguration;
  
  @GetMapping("/currency-configuration")
  public CurrencyServiceConfiguration retrieveAllCourses() {
    return currencyServiceConfiguration;
  }
}
