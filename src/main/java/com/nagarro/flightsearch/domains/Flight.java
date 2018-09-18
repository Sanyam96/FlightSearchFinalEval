package com.nagarro.flightsearch.domains;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Sanyam Goel created on 18/9/18
 */
@Entity
@Table(name = "flightdetails")
public class Flight {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "departure_location")
    private String departureLocation;

    @Column(name = "arrival_location")
    private String arrivalLocation;

    @Column(name = "valid_till")
    private Date validTillDate;

    @Column(name = "flight_time")
    private String flightTime;

    @Column(name = "flight_duration")
    private Float flightDuration;

    @Column(name = "fare")
    private int flightFare;

    @Column(name = "seat_availability")
    private String isFlightAvailable;

    @Column(name = "class")
    private String flightClass;


    /**
     * Getters and Setters
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
