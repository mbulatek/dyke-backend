package com.dyke.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "tickets")
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;
  private int projectID;
  
  private String description;
  @OneToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="priorityID")
  private TicketPriority priority;
  private int team;
  private int type;
  private int resolution;
  private int reporter;
  private int component;
  private int assignee;

  public Ticket() {
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public int getProjectID() {
    return projectID;
  }

  public void setProjectID(int projectID) {
    this.projectID = projectID;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TicketPriority getPriority() {
    return priority;
  }

  public void setPriority(TicketPriority priority) {
    this.priority = priority;
  }

  public int getTeam() {
    return team;
  }

  public void setTeam(int team) {
    this.team = team;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getResolution() {
    return resolution;
  }

  public void setResolution(int resolution) {
    this.resolution = resolution;
  }

  public int getReporter() {
    return reporter;
  }

  public void setReporter(int reporter) {
    this.reporter = reporter;
  }

  public int getComponent() {
    return component;
  }

  public void setComponent(int component) {
    this.component = component;
  }

  public int getAssignee() {
    return assignee;
  }

  public void setAssignee(int assignee) {
    this.assignee = assignee;
  }
}
