package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table (name = "tickets_resolutions")
public class TicketResolution {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public Integer getId() {
    return id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
=======
@Table(name = "ticket_resolution")
public class TicketResolution {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
>>>>>>> 0iwork with mysql model
}
