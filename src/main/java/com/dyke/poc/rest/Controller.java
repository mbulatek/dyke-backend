package com.dyke.poc.rest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dyke.poc.database.ProjectRepositoryImpl;

@RestController
public class Controller {

  @Autowired
  protected ProjectRepositoryImpl repo;

  protected static final Logger LOGGER = Logger.getLogger(ProjectController.class.getName());
}
