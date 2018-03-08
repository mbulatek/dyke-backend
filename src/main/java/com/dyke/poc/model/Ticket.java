package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer projectId;
  private String description;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "typeId")
  private TicketType type;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "statusId")
  private TicketStatus status;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "resolutionId")
  private TicketResolution resolution;
  
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "priorityId")
  private TicketPriority priority;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "reporterId")
  private User reporter;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "assigneeId")
  private User assignee;
  
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "componentId")
  private Component component;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "milestoneId")
  private Milestone milestone;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "teamId")
  private Team team;
  

  public Ticket() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
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

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public TicketType getType() {
    return type;
  }

  public void setType(TicketType type) {
    this.type = type;
  }

  public TicketResolution getResolution() {
    return resolution;
  }

  public void setResolution(TicketResolution resolution) {
    this.resolution = resolution;
  }

  public User getReporter() {
    return reporter;
  }

  public void setReporter(User reporter) {
    this.reporter = reporter;
  }

  public Component getComponent() {
    return component;
  }

  public void setComponent(Component component) {
    this.component = component;
  }

  public User getAssignee() {
    return assignee;
  }

  public void setAssignee(User assignee) {
    this.assignee = assignee;
  }
}
