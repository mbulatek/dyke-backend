package com.dyke.poc.database;

import com.dyke.poc.model.Project;

public interface ProjectRepository {

  void saveProject(Project project);

  Project getProject(int id);

}
