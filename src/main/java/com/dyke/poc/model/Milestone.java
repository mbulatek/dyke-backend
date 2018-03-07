package com.dyke.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table (name = "tickets_milestones")
public class Milestone {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;
  
  @Column(columnDefinition = "TINYINT")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean reached;
  
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
  
  public void setReached(Boolean reached) {
    this.reached = reached;
  }
  
  public Boolean idReached() {
    return reached;
  }
}
