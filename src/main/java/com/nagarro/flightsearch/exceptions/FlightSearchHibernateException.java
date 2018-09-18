package com.nagarro.flightsearch.exceptions;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightSearchHibernateException extends FlightSearchBaseException {

    public FlightSearchHibernateException() {
    }

    public FlightSearchHibernateException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightSearchHibernateException(String message, String errorCode) {
        super(message, errorCode);
    }

    public FlightSearchHibernateException(String message) {
        super(message);
    }

    public FlightSearchHibernateException(Throwable cause) {
        super(cause);
    }

    public FlightSearchHibernateException(String message, String errorCode, Throwable cause) {
        super(message, errorCode, cause);
    }
}
