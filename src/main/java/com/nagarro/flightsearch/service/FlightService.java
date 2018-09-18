package com.nagarro.flightsearch.service;

import com.nagarro.flightsearch.domains.Flight;
import com.nagarro.flightsearch.dtos.FlightDTO;
import com.nagarro.flightsearch.exceptions.FlightSearchResourceNotFoundException;
import com.nagarro.flightsearch.repository.FlightRepository;
import com.nagarro.flightsearch.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<FlightDTO> getAllFlights() {
        List<Flight> flightList = flightRepository.getList(Flight.class);
        List<FlightDTO> flightDTOList = Utility.convertModelList(flightList, FlightDTO.class);

        if (flightDTOList == null || flightDTOList.isEmpty()) {
            throw new FlightSearchResourceNotFoundException("Flight List not found");
        }

        return flightDTOList;
    }

}
