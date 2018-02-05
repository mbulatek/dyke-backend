package com.dyke.poc.database;

import com.dyke.poc.model.Project;
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
}
