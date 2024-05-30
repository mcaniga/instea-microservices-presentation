package com.instea.presentation.microservices.amicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

/***
 * SpringBootApplication - convenience annotation combining 3 annotations
 *   - SpringBootConfiguration - Tags the class as a source of bean definitions for the application context
 *   - EnableAutoConfiguration - Initialize beans based properties and dependencies presence
 *   - ComponentScan - Look for beans from current package
 * EnableFeignClients - Enables searching for interfaces that are annotated with @FeignClient
 * EnableDiscoveryClient - Enables communication with Eureka Service Registry (both to register and discover others)
 */

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class AmicroserviceApplication {

  /**
   * Main method which serves as the entry point for the Spring Boot application.
   * This method boots up the API Gateway application using Spring Boot's {@link SpringApplication#run(Class, String...)}
   * method, which starts the Spring application context and auto-configures the Spring application based on the
   * classpath settings, other beans, and various property settings.
   *
   * @param args Command line arguments passed to the application.
   */
  public static void main(String[] args) {
    SpringApplication.run(AmicroserviceApplication.class, args);
  }

  @Bean
  public RouterFunction<ServerResponse> routerFunction() {
    return RouterFunctions.route()
        .GET("/api/data", this::handleDataRequest)
        .build();
  }

  private ServerResponse handleDataRequest(ServerRequest request) {
    // Logic to handle the request or forward it
    // For example, using RestTemplate to forward:
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/api/process", String.class);
    return ServerResponse.ok().body(response.getBody());
  }

}
