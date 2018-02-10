package com.dyke.poc.rest;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.database.ProjectRepositoryImpl;
import com.dyke.poc.model.Project;
import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

@RestController
public class ProjectController {

	@Autowired
	private ProjectRepositoryImpl repo;
	
	private static final Logger LOGGER = Logger.getLogger( ProjectController.class.getName() );

	@RequestMapping("/addProject")
    public Project addProject(@RequestParam(value="name") String name,
    				@RequestParam(value="desc") String description) {

		LOGGER.log(Level.INFO, "ProjectController/addProject");
				
    	Project			project = new Project();
    	project.setName(name);;
    	project.setDescription(description);
    	
    	repo.saveProject(project);
    	
        return project;
    }

	@RequestMapping("/addTicket")
    public Ticket addTicket(@RequestParam(value="projectID") int projectID,
    				@RequestParam(value="desc") String description,
    				@RequestParam(value="priority") String priority) {

		LOGGER.log(Level.INFO, "ProjectController/addTicket");
				
    	
		Ticket			ticket = new Ticket();
		ticket.setProjectID(projectID);
    	ticket.setDescription(description);
    	TicketPriority	ticketPriority = new TicketPriority();
		ticketPriority.setName(priority);
		ticket.setPriority(ticketPriority);

    	repo.saveTicketPriority(ticketPriority);
    	repo.saveTicket(ticket);
    	
        return ticket;
    }
}
