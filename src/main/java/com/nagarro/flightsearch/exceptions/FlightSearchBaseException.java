package com.nagarro.flightsearch.exceptions;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightSearchBaseException extends RuntimeException {

    private String errorCode;

    public FlightSearchBaseException() {
    }

    public FlightSearchBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightSearchBaseException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public FlightSearchBaseException(String message) {
        super(message);
    }

    public FlightSearchBaseException(Throwable cause) {
        super(cause);
    }

    public FlightSearchBaseException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}