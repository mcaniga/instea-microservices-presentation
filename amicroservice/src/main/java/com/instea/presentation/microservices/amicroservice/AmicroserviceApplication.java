package com.instea.presentation.microservices.amicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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

  public static void main(String[] args) {
    SpringApplication.run(AmicroserviceApplication.class, args);
  }

}