package com.dyke.poc.database;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import java.util.List;

public interface ProjectRepository {

  void saveProject(Project project);

  Project getProject(int id);

  List<Project> listProject();

  void saveTicket(Ticket ticket);

  Ticket getTicket(int id);

  List listTicketsByProject(int projectId);

  void saveTicketPriority(TicketPriority priority);



  TicketPriority getTicketPriority(int id);

  List<TicketPriority> listProrities();
}

