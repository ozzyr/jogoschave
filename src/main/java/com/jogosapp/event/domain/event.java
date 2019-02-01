package com.jogosapp.event.domain;

import java.util.Date;

public class event {
  private Date date;
  private String name;
  private String address;


  public event() {
  }

  public event(Date date, String name, String address) {
    this.date = date;
    this.name = name;
    this.address = address;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}

