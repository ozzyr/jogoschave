package com.jogosapp.event.repository.entity;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Qualifier("RepoEvent")
public class entityEvent extends AbstractEntity {
  private String name;
  private String address;
  private Date date;
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String tipo) {
    this.type = tipo;
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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
