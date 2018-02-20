package com.dyke.poc.rest;

import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import java.util.List;
import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController extends Controller {

  @RequestMapping(value = "/addTicket", method = RequestMethod.POST)
  public Ticket addTicket(@RequestParam(value = "projectId") int projectId,
      @RequestParam(value = "desc") String description,
      @RequestParam(value = "priority") int priority) {

    LOGGER.log(Level.INFO, "TicketController/addTicket");

    Ticket ticket = new Ticket();
    ticket.setProjectId(projectId);
    ticket.setDescription(description);
    ticket.setPriority(repo.getTicketPriority(priority));

    repo.saveTicket(ticket);

    return ticket;
  }

  @RequestMapping(value = "/getTicket", method = RequestMethod.GET)
  public Ticket getTicket(@RequestParam(value = "ID") int id) {

    LOGGER.log(Level.INFO, "TicketController/getTicket");

    return repo.getTicket(id);
  }

  @RequestMapping(value = "/listTicketsByProject", method = RequestMethod.GET)
  public List<Ticket> listTicketsByProject(@RequestParam(value = "projectId") int projectId) {

    LOGGER.log(Level.INFO, "TicketController/listTicketsByProject");

    return repo.listTicketsByProject(projectId);
  }

  @RequestMapping(value = "/addTicketPriority", method = RequestMethod.POST)
  public TicketPriority addTicketPriority(@RequestParam(value = "name") String name,
      @RequestParam(value = "order") int order) {

    LOGGER.log(Level.INFO, "TicketController/addTicketPriority");

    TicketPriority ticketPriority = new TicketPriority();
    ticketPriority.setName(name);
    ticketPriority.setPriorityOrder(order);

    repo.saveTicketPriority(ticketPriority);

    return ticketPriority;
  }

  @RequestMapping(value = "/getTicketPriorities", method = RequestMethod.GET)
  public List<TicketPriority> getTicketPriorities() {

    LOGGER.log(Level.INFO, "TicketController/getTicketPriorities");

    return repo.listProrities();
  }
}
