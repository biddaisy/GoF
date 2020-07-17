package com.mr.gof.behavioral.mediator;

public class Beneficiary {
  private final String name;
  private final Country country;

  public Beneficiary(String name, Country country) {
    this.name = name;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public Country getCountry() {
    return country;
  }
}
