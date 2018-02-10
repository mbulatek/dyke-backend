package com.dyke.poc.model;

/*import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;*/
//import org.hibernate.annotations.*;

import javax.persistence.*;

//import org.hibernate.annotations.Table;
import org.springframework.data.annotation.*;
import javax.persistence.Id;

import java.util.List;

@Entity(name = "projects")
//@Table
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;
  private String name;
  private String description;
  @OneToMany(mappedBy = "ID", cascade = CascadeType.ALL)
  private List<Ticket> tickets;
  @OneToMany(mappedBy = "team_id", cascade = CascadeType.ALL)
  private List<Team> teams;

  @ManyToMany(cascade = { CascadeType.ALL })
  @JoinTable(
      name = "users_to_projects", 
      joinColumns = { @JoinColumn(name = "projectID") }, 
      inverseJoinColumns = { @JoinColumn(name = "userID") })
  private List<Team> users;

  

  public Project() {
  }

  public int getProject_id() {
    return ID;
  }

  public void setProject_id(int ID) {
    this.ID = ID;
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



