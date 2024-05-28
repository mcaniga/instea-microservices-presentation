package com.instea.presentation.bmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Controller to process data requests.
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "Data Processing", description = "The Data Processing Controller for Service B")
public class DataController {

  /**
   * Endpoint to process and return data.
   * @return a simple string representing data processed.
   */
  @GetMapping("/process")
  @Operation(summary = "Process Data", description = "Processes and returns data from Service B")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful retrieval of processed data")
  })
  public String processData() {
    return "Data processed by Service B";
  }
}
