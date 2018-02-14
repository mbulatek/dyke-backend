package com.dyke.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "tickets_priorities")
public class TicketPriority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;
  private String name;
  private int priorityOrder;
	
  public void setID(int ID) { this.ID = ID; }
  public int getID() { return ID; }
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
  public void setPriorityOrder(int order) { this.priorityOrder = order; }
  public int getPriorityOrder() { return priorityOrder; }
}
