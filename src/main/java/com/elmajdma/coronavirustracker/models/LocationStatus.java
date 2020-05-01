package com.elmajdma.coronavirustracker.models;

public class LocationStatus {
    private String state;
    private String country;
    private int latestTotalCases;
    private int differanceFromLastDate;

    public int getDifferanceFromLastDate() {
        return differanceFromLastDate;
    }

    public void setDifferanceFromLastDate(int differanceFromLastDate) {
        this.differanceFromLastDate = differanceFromLastDate;
    }

    public LocationStatus() {
    }

    public LocationStatus(String state, String country, int latestTotalCases) {
        this.state = state;
        this.country = country;
        this.latestTotalCases = latestTotalCases;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocationStatus(String state, String country, int latestTotalCases, int differanceFromLastDate) {
        this.state = state;
        this.country = country;
        this.latestTotalCases = latestTotalCases;
        this.differanceFromLastDate = differanceFromLastDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStatus{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", differanceFromLastDate=" + differanceFromLastDate +
                '}';
    }
}
