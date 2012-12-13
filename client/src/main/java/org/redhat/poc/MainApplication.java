package org.redhat.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {

    static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    static ClientService clientService;

    public static void main(String [] args) {

        clientService = new ClientService();

        // Call getStudents
        logger.info(">> Get Students");
        clientService.getStudents();

        // Call getCourses
        logger.info(">> Get Students");
        clientService.getCourses();



    }

}
