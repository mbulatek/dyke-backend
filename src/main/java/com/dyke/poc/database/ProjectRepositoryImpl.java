package com.dyke.poc.database;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import java.util.List;

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

  @Override
  public Project getProject(int id) {
    return entityManager.find(Project.class, id);
  }

  @Override
  public List<Project> listProject() {
    return entityManager.createQuery("from Project", Project.class)
        .getResultList();
  }

  @Override
  public void saveTicket(Ticket ticket) {
    entityManager.persist(ticket);
  }

  @Override
  public Ticket getTicket(int id) {
    return entityManager.find(Ticket.class, id);
  }

  @Override
  public List<Ticket> listTicketsByProject(int projectId) {
    return entityManager.createQuery("from Ticket t where t.projectId = :projectId", Ticket.class)
        .setParameter("projectId", projectId)
        .getResultList();
  }

  @Override
  public void saveTicketPriority(TicketPriority priority) {
    entityManager.persist(priority);
  }

  @Override
  public TicketPriority getTicketPriority(int id) {
    return entityManager.find(TicketPriority.class, id);
  }

  @Override
  public List<TicketPriority> listProrities() {
    return entityManager.createQuery("from TicketPriority", TicketPriority.class)
        .getResultList();
  }
}
