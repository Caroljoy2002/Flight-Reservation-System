package com.company;
public class Flight {
    private String flightname;
    private String airline;
    private int totalseats;
    private int noofseatbooked;
    private String dateofDeparture;
    private String dateofArrival;
    private String timeofDeparture;
    private String timeOfArrival;

    public Flight(String flightname, String airline, int totalseats, int noofseatbooked,
                  String dateofDeparture, String dateofArrival, String timeofDeparture, String timeOfArrival) {
        this.flightname = flightname;
        this.airline = airline;
        this.totalseats = totalseats;
        this.noofseatbooked = noofseatbooked;
        this.dateofDeparture = dateofDeparture;
        this.dateofArrival = dateofArrival;
        this.timeofDeparture = timeofDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    String getflightDetails() {
        return flightname + ", " + airline + ", " + dateofArrival + ", " + dateofDeparture + "," +
                timeOfArrival + "," + timeofDeparture;
    }

    int availableseats(){
        return totalseats - noofseatbooked;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public int getNoofseatbooked() {
        return noofseatbooked;
    }

    public void setNoofseatbooked(int noofseatbooked) {
        this.noofseatbooked = noofseatbooked;
    }

    public String getDateofDeparture() {
        return dateofDeparture;
    }

    public void setDateofDeparture(String dateofDeparture) {
        this.dateofDeparture = dateofDeparture;
    }

    public String getDateofArrival() {
        return dateofArrival;
    }

    public void setDateofArrival(String dateofArrival) {
        this.dateofArrival = dateofArrival;
    }

    public String getTimeofDeparture() {
        return timeofDeparture;
    }

    public void setTimeofDeparture(String timeofDeparture) {
        this.timeofDeparture = timeofDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }
}
