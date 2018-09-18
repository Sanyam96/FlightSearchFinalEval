package com.nagarro.flightsearch.dtos;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightsResponseDTO {

    private List<FlightDTO> flightList;

    private long nextSearchFlightId;

    private Integer totalCount;

    public FlightsResponseDTO() {
    }

    public FlightsResponseDTO(List<FlightDTO> flightList, long nextSearchFlightId, Integer totalCount) {
        this.flightList = flightList;
        this.nextSearchFlightId = nextSearchFlightId;
        this.totalCount = totalCount;
    }

    public List<FlightDTO> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<FlightDTO> flightList) {
        this.flightList = flightList;
    }

    public long getNextSearchFlightId() {
        return nextSearchFlightId;
    }

    public void setNextSearchFlightId(long nextSearchFlightId) {
        this.nextSearchFlightId = nextSearchFlightId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "FlightsResponseDTO{" +
                "flightList=" + flightList +
                ", nextSearchFlightId=" + nextSearchFlightId +
                ", totalCount=" + totalCount +
                '}';
    }
}
