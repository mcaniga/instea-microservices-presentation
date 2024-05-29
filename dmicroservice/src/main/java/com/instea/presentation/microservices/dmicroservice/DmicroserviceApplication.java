package com.instea.presentation.microservices.dmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Boot application that initializes and runs the Eureka Server.
 * <p>
 * This class serves as the entry point for the Spring Boot application that hosts the Eureka Server,
 * used for service discovery. The Eureka Server acts as a registry for all microservices,
 * allowing them to find and communicate with each other dynamically.
 * </p>
 *
 * Spring Cloud Netflix Reference - https://cloud.spring.io/spring-cloud-netflix/reference/html/
 */
@SpringBootApplication
@EnableEurekaServer
public class DmicroserviceApplication {

  /**
   * The main method that starts up the Spring Boot application.
   * <p>
   handling routing requests and service registry updates. It sets up the context and starts the embedded server.
   * </p>
   *
   * @param args Command line arguments passed to the application.
   */
  public static void main(String[] args) {
    SpringApplication.run(DmicroserviceApplication.class, args);
  }

}
