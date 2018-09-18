package com.nagarro.flightsearch.dtos;

import java.util.Date;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightDTO {

    private long id;

    private String flightNumber;

    private String departureLocation;

    private String arrivalLocation;

    private Date validTillDate;

    private String flightTime;

    private Float flightDuration;

    private int flightFare;

    private String isFlightAvailable;

    private String flightClass;

    public FlightDTO() {
    }

    public FlightDTO(int id, String flightNumber, String departureLocation, String arrivalLocation, Date validTillDate, String flightTime, Float flightDuration, int flightFare, String isFlightAvailable, String flightClass) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.validTillDate = validTillDate;
        this.flightTime = flightTime;
        this.flightDuration = flightDuration;
        this.flightFare = flightFare;
        this.isFlightAvailable = isFlightAvailable;
        this.flightClass = flightClass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Date getValidTillDate() {
        return validTillDate;
    }

    public void setValidTillDate(Date validTillDate) {
        this.validTillDate = validTillDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public Float getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Float flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getFlightFare() {
        return flightFare;
    }

    public void setFlightFare(int flightFare) {
        this.flightFare = flightFare;
    }

    public String getIsFlightAvailable() {
        return isFlightAvailable;
    }

    public void setIsFlightAvailable(String isFlightAvailable) {
        this.isFlightAvailable = isFlightAvailable;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    @Override
    public String toString() {
        return "FlightDTO{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                ", validTillDate=" + validTillDate +
                ", flightTime='" + flightTime + '\'' +
                ", flightDuration=" + flightDuration +
                ", flightFare=" + flightFare +
                ", isFlightAvailable='" + isFlightAvailable + '\'' +
                ", flightClass='" + flightClass + '\'' +
                '}';
    }
}
