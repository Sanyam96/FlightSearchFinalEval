package com.nagarro.flightsearch.dtos;

import java.util.List;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public class FlightsResponseDTO {

    private List<FlightDTO> transactionList;

    private long nextTransactionId;

    private Integer totalCount;

    public FlightsResponseDTO() {
    }

    public FlightsResponseDTO(List<FlightDTO> transactionList, long nextTransactionId, Integer totalCount) {
        this.transactionList = transactionList;
        this.nextTransactionId = nextTransactionId;
        this.totalCount = totalCount;
    }

    public List<FlightDTO> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<FlightDTO> transactionList) {
        this.transactionList = transactionList;
    }

    public long getNextTransactionId() {
        return nextTransactionId;
    }

    public void setNextTransactionId(long nextTransactionId) {
        this.nextTransactionId = nextTransactionId;
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
                "transactionList=" + transactionList +
                ", nextTransactionId=" + nextTransactionId +
                ", totalCount=" + totalCount +
                '}';
    }
}
