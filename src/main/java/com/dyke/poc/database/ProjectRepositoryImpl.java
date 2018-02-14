package com.dyke.poc.database;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProjectRepositoryImpl implements ProjectRepository {

  @PersistenceContext
  private EntityManager entityManager;
  
  @Override
  public void saveProject(Project project) {
    entityManager.persist(project);
  }

  public void saveTicketPriority(TicketPriority priority) {
    entityManager.persist(priority);
  }

  public void saveTicket(Ticket ticket) {
    entityManager.persist(ticket);
  }

  @Override
  public Project getProject(int id) {
    return entityManager.find(Project.class, id);
  }
  
  @Override
  public Ticket getTicket(int id) {
	  return entityManager.find(Ticket.class, id);
  }

  @Override
  public TicketPriority getTicketPriority(int id) {
	  return entityManager.find(TicketPriority.class, id);
  }
}
