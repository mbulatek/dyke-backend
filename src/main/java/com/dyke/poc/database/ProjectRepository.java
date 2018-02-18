package com.dyke.poc.database;

import java.util.List;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

public interface ProjectRepository {

  void saveProject(Project project);

  Project getProject(int id);

  Ticket getTicket(int id);

  List listTicketsByProject(int projectID);

  TicketPriority getTicketPriority(int id);
}
