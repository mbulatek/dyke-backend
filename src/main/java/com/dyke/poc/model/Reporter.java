package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reporter {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

}
