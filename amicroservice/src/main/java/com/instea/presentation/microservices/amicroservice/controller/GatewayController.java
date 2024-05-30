package com.instea.presentation.microservices.amicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.instea.presentation.microservices.amicroservice.client.BMicroserviceClient;

/**
 * Controller for exposing service B
 * Spring API Gateway provides its own mechanism for exposing routes (from amicroservice-default.properties)
 * This controller is present only to demonstrate Feign client ( too lazy to create new microservice :)) ).
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GatewayController {

  private final BMicroserviceClient backendClient;

  /**
   * Fetches data by making a call through the backend service client.
   * This method serves as a public proxy for fetching data from the internal service B.
   *
   * @return A string representation of the data retrieved from the backend service.
   */
  @GetMapping("/data-feign")
  public String getData() {
    return backendClient.getData();
  }
}
