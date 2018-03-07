package com.dyke.poc.rest;

import java.util.List;
import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

@RestController
public class ProjectController extends Controller {

  @RequestMapping(value = "/project", method = RequestMethod.POST)
  public Project addProject(@RequestBody Project project) {

    LOGGER.log(Level.INFO, "ProjectController/project(POST)");

    repo.saveProject(project);
    return project;
  }

  @RequestMapping(value = "/project", method = RequestMethod.GET)
  public List<Project> getProjects() {

    LOGGER.log(Level.INFO, "ProjectController/project(GET)");

    return repo.listProject();
  }

}
