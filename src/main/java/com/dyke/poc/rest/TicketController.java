package com.dyke.poc.rest;

import java.util.List;
import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

@RestController
public class TicketController extends Controller {

  @RequestMapping("/addTicket")
  public Ticket addTicket(@RequestParam(value = "projectID") int projectID,
      @RequestParam(value = "desc") String description,
      @RequestParam(value = "priority") int priority) {

    LOGGER.log(Level.INFO, "ProjectController/addTicket");

    Ticket ticket = new Ticket();
    ticket.setProjectID(projectID);
    ticket.setDescription(description);
    ticket.setPriority(repo.getTicketPriority(priority));

    repo.saveTicket(ticket);

    return ticket;
  }

  @RequestMapping("/getTicket")
  public Ticket getTicket(@RequestParam(value = "ID") int ID) {

    LOGGER.log(Level.INFO, "ProjectController/getTicket");

    return repo.getTicket(ID);
  }

  @RequestMapping("/listTicketsByProject")
  public List<Ticket> listTicketsByProject(@RequestParam(value = "projectID") int projectID) {

    LOGGER.log(Level.INFO, "ProjectController/listTicketsByProject");

    return repo.listTicketsByProject(projectID);
  }

  @RequestMapping("/addTicketPriority")
  public TicketPriority addTicketPriority(@RequestParam(value = "name") String name,
      @RequestParam(value = "order") int order) {

    LOGGER.log(Level.INFO, "ProjectController/addTicketPriority");

    TicketPriority ticketPriority = new TicketPriority();
    ticketPriority.setName(name);
    ticketPriority.setPriorityOrder(order);

    repo.saveTicketPriority(ticketPriority);

    return ticketPriority;
  }


}
