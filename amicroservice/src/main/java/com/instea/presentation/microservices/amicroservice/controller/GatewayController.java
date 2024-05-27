package com.instea.presentation.microservices.amicroservice.controller;

import com.instea.presentation.microservices.amicroservice.client.BMicroserviceClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;

/**
 * Gateway Controller acting as the entry point for all API calls directed to backend services.
 * This controller routes API requests to the appropriate backend service, handling data fetching operations.
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GatewayController {

  private BMicroserviceClient backendClient;

  /**
   * Fetches data by making a call through the backend service client.
   * This method serves as a public proxy for fetching data from the internal service B.
   *
   * @return A string representation of the data retrieved from the backend service.
   */
  @GetMapping("/data")
  @Operation(summary = "Fetch Data", description = "Fetch data from backend service B")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful retrieval of processed data")
  })
  public String getData() {
    return backendClient.getData();
  }
}
