package com.nagarro.flightsearch.controllers;

import com.nagarro.flightsearch.dtos.FlightDTO;
import com.nagarro.flightsearch.dtos.ResponseModel;
import com.nagarro.flightsearch.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@RequestMapping(value = "/")
@RestController
public class FlightController extends RestResponseHandler {

    @Autowired
    FlightService flightService;

    @RequestMapping(method = RequestMethod.GET, value = "/flights", produces = "application/json")
    public ResponseEntity<ResponseModel<List<FlightDTO>>> getAllFlights() {
        List<FlightDTO> flights = flightService.getAllFlights();
        return super.responseStandardizer(flights);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/flights/search", produces = "application/json")
    public ResponseEntity<ResponseModel<Object>> getSearchedFlights(
            @RequestParam(required = false, name = "nextSearchId", defaultValue = "0") long nextSearchId,
            @RequestParam(required = false, name = "size", defaultValue = "10") int size,
            @RequestParam(required = false, name = "isTotalCountRequired", defaultValue = "true") boolean isTotalCountRequired
    ) {
        return super.responseStandardizer(flightService.getFlightResults(nextSearchId, size, isTotalCountRequired));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/flights/search/params", produces = "application/json")
    public ResponseEntity<ResponseModel<Object>> getSearchedFlightsAccToParams(
            @RequestParam(required = false, name = "nextSearchId", defaultValue = "0") long nextSearchId,
            @RequestParam(required = false, name = "size", defaultValue = "3") int size,
            @RequestParam(required = false, name = "isTotalCountRequired", defaultValue = "true") boolean isTotalCountRequired,
            @RequestParam(required = true, name = "depLocation") String depLocation,
            @RequestParam(required = true, name = "arrLocation") String arrLocation,
            @RequestParam(required = true, name = "flightDate") String flightDate,
            @RequestParam(required = true, name = "flightClass") String flightClass,
            @RequestParam(required = false, name = "airline") String airline
    ) {
        return super.responseStandardizer(flightService.getsearchFlightResults(nextSearchId, size, isTotalCountRequired, depLocation, arrLocation, flightDate, flightClass, airline));
    }

}
