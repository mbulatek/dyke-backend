package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ticket_id;
  private int project_id;
  private String description;
  private int priority;
  private int team;
  private int type;
  private int resolution;
  private int reporter;
  private int component;
  private int assignee;

  public Ticket() {
  }

  public int getTicket_id() {
    return ticket_id;
  }

  public void setTicket_id(int ticket_id) {
    this.ticket_id = ticket_id;
  }

  public int getProject_id() {
    return project_id;
  }

  public void setProject_id(int project_id) {
    this.project_id = project_id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
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
