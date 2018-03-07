package com.dyke.poc.rest;

import com.dyke.poc.model.Ticket;
import com.dyke.poc.model.TicketPriority;

import java.util.List;
import java.util.logging.Level;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController extends Controller {

  @RequestMapping(value = "/ticket", method = RequestMethod.POST)
  public Ticket addTicket(@RequestBody Ticket ticket) {

    LOGGER.log(Level.INFO, "TicketController/ticket(POST)");

    repo.saveTicket(ticket);

    return ticket;
  }

  @RequestMapping(value = "/ticket", method = RequestMethod.GET)
  public List<Ticket> listTickets(@RequestBody Ticket ticket) {

    LOGGER.log(Level.INFO, "TicketController/ticket(GET)");

    return repo.listTickets(ticket);
  }

  @RequestMapping(value = "/ticket/priority", method = RequestMethod.POST)
  public TicketPriority addTicketPriority(@RequestBody TicketPriority ticketPriority) {

    LOGGER.log(Level.INFO, "TicketController/ticket/priority(POST)");

    repo.saveTicketPriority(ticketPriority);

    return ticketPriority;
  }

  @RequestMapping(value = "/ticket/priority", method = RequestMethod.GET)
  public List<TicketPriority> getTicketPriorities() {

    LOGGER.log(Level.INFO, "TicketController/ticket/priority(GET)");

    return repo.listProrities();
  }
}
