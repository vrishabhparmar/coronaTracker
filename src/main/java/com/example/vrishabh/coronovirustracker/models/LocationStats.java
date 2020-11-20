package com.example.vrishabh.coronovirustracker.models;

public class LocationStats {




    private String state;
    private String country;
    private int latestReportedTotalCase;


    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestReportedTotalCase() {
        return latestReportedTotalCase;
    }


    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestReportedTotalCase(int latestReportedTotalCase) {
        this.latestReportedTotalCase = latestReportedTotalCase;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}
