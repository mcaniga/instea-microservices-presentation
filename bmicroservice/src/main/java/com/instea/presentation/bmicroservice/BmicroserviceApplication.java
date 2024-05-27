package com.instea.presentation.bmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * SpringBootApplication - convenience annotation combining 3 annotations
 *   - SpringBootConfiguration - Tags the class as a source of bean definitions for the application context
 *   - EnableAutoConfiguration - Initialize beans based properties and dependencies presence
 *   - ComponentScan - Look for beans from current package
 * EnableDiscoveryClient - Enables communication with Eureka Service Registry (both to register and discover others)
 */

@SpringBootApplication
@EnableDiscoveryClient
public class BmicroserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(BmicroserviceApplication.class, args);
  }

}
