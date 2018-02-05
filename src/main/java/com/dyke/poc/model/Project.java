package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

@Entity
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int project_id;
  private String name;
  private String description;
//  private List<User> users;
//  private List<Team> teams;
//  private List<Ticket> tickets;


  public Project() {
  }

  public int getProject_id() {
    return project_id;
  }

  public void setProject_id(int project_id) {
    this.project_id = project_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

//  public List<User> getUsers() {
//    return users;
//  }
//
//  public void setUsers(List<User> users) {
//    this.users = users;
//  }
//
//  public List<Team> getTeams() {
//    return teams;
//  }
//
//  public void setTeams(List<Team> teams) {
//    this.teams = teams;
//  }
//
//  public List<Ticket> getTickets() {
//    return tickets;
//  }
//
//  public void setTickets(List<Ticket> tickets) {
//    this.tickets = tickets;
//  }
}



