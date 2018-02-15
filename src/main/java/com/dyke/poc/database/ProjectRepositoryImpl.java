package com.dyke.poc.database;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.proxy.HibernateProxy;
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
  public List<Ticket> listTicketsByProject(int projectID) {
	  return entityManager.createQuery("SELECT ticket FROM Ticket tickey WHERE ticket.projectID LIKE :projectID")
			  .setParameter("projectID", projectID)
			  .getResultList();
  }

  @Override
  public TicketPriority getTicketPriority(int id) {
	  return entityManager.find(TicketPriority.class, id);
  }
}
