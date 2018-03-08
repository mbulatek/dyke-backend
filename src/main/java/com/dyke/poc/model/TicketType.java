package com.dyke.poc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "tickets_types")
public class TicketType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  
  @Column(columnDefinition = "TINYINT")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean isContainer;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "tickets_statuses_to_tickets_types",
      joinColumns = {@JoinColumn(name = "ticketTypeId")},
      inverseJoinColumns = {@JoinColumn(name = "ticketStatusId")})
  private List<TicketStatus> statuses;
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "tickets_priorities_to_tickets_types",
      joinColumns = {@JoinColumn(name = "ticketTypeId")},
      inverseJoinColumns = {@JoinColumn(name = "ticketPriorityId")})
  private List<TicketPriority> priorities;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "tickets_resolutions_to_tickets_types",
      joinColumns = {@JoinColumn(name = "ticketTypeId")},
      inverseJoinColumns = {@JoinColumn(name = "ticketResolutionId")})
  private List<TicketResolution> resolutions;
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Boolean isContainer() {
    return isContainer;
  }
  
  public void setContainer(Boolean isContainer) {
    this.isContainer = isContainer;
  }
  
  public List<TicketStatus> getStatuses() {
    return statuses;
  }
  
  public void addStatus(TicketStatus status) {
    statuses.add(status);
  }
  
  public List<TicketPriority> getPriorities() {
    return priorities;
  }
  
  public void addPriority(TicketPriority priority) {
    priorities.add(priority);
  }
  
  public List<TicketResolution> getResolutions() {
    return resolutions;
  }
  
  public void addResolution(TicketResolution resolution) {
    resolutions.add(resolution);
  }
}
