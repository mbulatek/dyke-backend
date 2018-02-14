package com.dyke.poc.database;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

public interface ProjectRepository {

  void saveProject(Project project);

  Project getProject(int id);
  
  Ticket getTicket(int id);
  
  TicketPriority getTicketPriority(int id);
}
