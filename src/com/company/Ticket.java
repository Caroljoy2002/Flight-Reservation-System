package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    private long pnrno;
    private boolean confirmed;
    private int price;
    private String departureLocation;
    private String destinationLocation;
    Flight flight;
    Passenger details;

    boolean getticketstatus(){
        return  confirmed;
    }
    String getdurationofjourney() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time1 = format.parse(flight.getTimeofDeparture());
        Date time2 = format.parse(flight.getTimeOfArrival());

        long duration = Math.abs(time2.getTime() - time1.getTime());
        long diffSeconds = duration / 1000 % 60;
        long diffMinutes = duration / (60 * 1000) % 60;
        long diffHours = duration / (60 * 60 * 1000) % 24;
        return "Duration of journey : " + diffHours + " hours " + diffMinutes + " minutes " +
                diffSeconds + " seconds";
    }

    void updateSeats(){
        if(confirmed == true){
            flight.setNoofseatbooked(flight.getNoofseatbooked()+1);
        }
    }
    Flight getFlight(){
        return flight;
    }
    void cancelTicket(){
        confirmed = false;
        flight.setNoofseatbooked(flight.getNoofseatbooked()-1);
    }
    void confirmTicket(){
        confirmed = true;
        updateSeats();
    }

    public Ticket(long pnrno, boolean confirmed, int price, String departureLocation, String destinationLocation,
                  Flight flight, Passenger details) {
        this.pnrno = pnrno;
        this.confirmed = confirmed;
        this.price = price;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.flight = flight;
        this.details = details;
    }

    public long getPnrno() {
        return pnrno;
    }

    public void setPnrno(long pnrno) {
        this.pnrno = pnrno;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}

