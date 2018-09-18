package com.nagarro.flightsearch.exceptions;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightSearchResourceNotFoundException extends FlightSearchBaseException {

    public FlightSearchResourceNotFoundException() {
    }

    public FlightSearchResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightSearchResourceNotFoundException(String message, String errorCode) {
        super(message, errorCode);
    }

    public FlightSearchResourceNotFoundException(String message) {
        super(message);
    }

    public FlightSearchResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public FlightSearchResourceNotFoundException(String message, String errorCode, Throwable cause) {
        super(message, errorCode, cause);
    }
}