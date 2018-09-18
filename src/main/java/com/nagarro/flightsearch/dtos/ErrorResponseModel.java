package com.nagarro.flightsearch.dtos;

import com.nagarro.flightsearch.enums.FlightSearchExceptionType;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class ErrorResponseModel {

    private FlightSearchExceptionType exceptionType;

    private String errorCode;

    private String errorMessage;

    private long time;

    private List<String> errorCause;

    public ErrorResponseModel(FlightSearchExceptionType exceptionType, String errorCode, String errorMessage, long time, List<String> errorCause) {
        this.exceptionType = exceptionType;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.time = time;
        this.errorCause = errorCause;
    }

    public ErrorResponseModel() {
    }
}
