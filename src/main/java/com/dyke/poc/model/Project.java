package com.dyke.poc.model;

import javax.persistence.*;
import javax.persistence.Id;

import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String description;
  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Ticket> tickets;
  @OneToMany(mappedBy = "teamId", cascade = CascadeType.ALL)
  private List<Team> teams;
  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "users_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "userId")})
  private List<Team> users;

  public Project() {
  }

  public int getProject_id() {
    return id;
  }

  public void setProject_id(int ID) {
    this.id = ID;
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

  public List<Ticket> getTickets() {
    return tickets;
  }

  public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }

  public void addTicket(Ticket ticket) {
    tickets.add(ticket);
  }

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }
}



