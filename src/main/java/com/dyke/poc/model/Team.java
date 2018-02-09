package com.dyke.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.List;
@Entity
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int team_id;
  private String name;
  @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<User> users;


  public Team() {
  }

  public int getTeam_id() {
    return team_id;
  }

  public void setTeam_id(int team_id) {
    this.team_id = team_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
