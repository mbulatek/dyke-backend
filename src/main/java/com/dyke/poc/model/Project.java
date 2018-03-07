package com.dyke.poc.model;

import javax.persistence.*;
import javax.persistence.Id;

import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String description;
  
  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Ticket> tickets;
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "tickets_types_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "ticketTypeId")})
  private List<TicketType> ticketsTypes;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "components_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "componentId")})
  private List<Component> components;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "milestones_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "milestoneId")})
  private List<Milestone> milestones;

  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "teams_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "teamId")})
  private List<Team> teams;

  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "users_to_projects",
      joinColumns = {@JoinColumn(name = "projectId")},
      inverseJoinColumns = {@JoinColumn(name = "userId")})
  private List<Team> users;


  public Project() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer ID) {
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



