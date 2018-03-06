package com.dyke.poc.rest;

import java.util.List;
import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

@RestController
public class ProjectController extends Controller {

  @RequestMapping(value = "/addProject", method = RequestMethod.POST)
  public Project addProject(@RequestParam(value = "name") String name,
      @RequestParam(value = "desc") String description) {

    LOGGER.log(Level.INFO, "ProjectController/addProject");

    Project project = new Project();
    project.setName(name);
    project.setDescription(description);
    repo.saveProject(project);
    return project;
  }

  @RequestMapping(value = "/getProject", method = RequestMethod.GET)
  public Project getProject(@RequestParam(value = "id") int id) {

    LOGGER.log(Level.INFO, "ProjectController/getProject");

    return repo.getProject(id);
  }

  @RequestMapping(value = "/getProjects", method = RequestMethod.GET)
  public List<Project> getProjects() {

    LOGGER.log(Level.INFO, "ProjectController/getProjects");

    return repo.listProject();
  }

}
