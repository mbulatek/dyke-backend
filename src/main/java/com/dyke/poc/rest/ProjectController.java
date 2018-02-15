package com.dyke.poc.rest;

import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

@RestController
public class ProjectController extends Controller {

  @RequestMapping("/addProject")
  public Project addProject(@RequestParam(value = "name") String name,
      @RequestParam(value = "desc") String description) {

    LOGGER.log(Level.INFO, "ProjectController/addProject");

    Project project = new Project();
    project.setName(name);
    ;
    project.setDescription(description);

    repo.saveProject(project);

    return project;
  }
}
