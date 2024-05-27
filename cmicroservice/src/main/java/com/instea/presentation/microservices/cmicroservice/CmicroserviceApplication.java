package com.instea.presentation.microservices.cmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Initializes and runs the Spring Cloud Config Server. The Config Server provides a central location
 * for managing external properties for applications across all environments. It serves configurations
 * stored in a variety of sources such as Git, SVN, or file systems, which are then accessed by client
 * applications over HTTP.
 *
 * <p>Spring Cloud Config Server allows for the externalized configuration of applications in any environment
 * and supports both symmetric and asymmetric encryption of configuration properties.
 *
 * <p>For more detailed information on the capabilities and usage of Spring Cloud Config Server, refer to the
 * official Spring documentation:
 * <a href="https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server">
 * Spring Cloud Config Server Documentation</a>.
 */
@SpringBootApplication
@EnableConfigServer
public class CmicroserviceApplication {

  /**
   * The main entry point for the Spring Boot application. This method runs the Spring Boot application using
   * {@link SpringApplication#run(Class, String...)}, which bootstrap the Spring Cloud Config Server, enabling
   * it to handle configuration requests from client applications.
   *
   * @param args command line arguments passed to the application
   */
  public static void main(String[] args) {
    SpringApplication.run(CmicroserviceApplication.class, args);
  }

}
