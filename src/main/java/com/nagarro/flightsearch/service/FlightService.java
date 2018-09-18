package com.nagarro.flightsearch.service;

import com.nagarro.flightsearch.domains.Flight;
import com.nagarro.flightsearch.dtos.FlightDTO;
import com.nagarro.flightsearch.dtos.FlightsResponseDTO;
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

    public FlightsResponseDTO getFlightResults(long nextSearchId, int size, boolean isTotalCountRequired) {
        List<Flight> flightData = flightRepository.getFlightsFromDb(nextSearchId, size);
        List<FlightDTO> flightDTOS = Utility.convertModelList(flightData, FlightDTO.class);

        if (flightDTOS == null || flightDTOS.isEmpty()) {
            throw new FlightSearchResourceNotFoundException("Flight List not found");
        }

        Integer totalCount = null;
        if (isTotalCountRequired) {
            totalCount = flightRepository.getTotalCount();
        }

        long nextComputedFlightSearchId = -1;
        int flightSearchListSize = flightDTOS.size();
        nextComputedFlightSearchId = flightSearchListSize < size ? -1 : flightDTOS.get(flightSearchListSize - 1).getId();
        return new FlightsResponseDTO(flightDTOS, nextComputedFlightSearchId, totalCount);
    }

}
