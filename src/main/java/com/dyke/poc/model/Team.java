package com.dyke.poc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "teams")
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;

  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "users_to_teams",
      joinColumns = {@JoinColumn(name = "teamId")},
      inverseJoinColumns = {@JoinColumn(name = "userId")})
  private List<User> users;

  public Team() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
  
  public void addUser(User user) {
    users.add(user);
  }
}
