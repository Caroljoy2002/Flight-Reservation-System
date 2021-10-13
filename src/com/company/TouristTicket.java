package com.company;

public class TouristTicket extends  Ticket{
    String hotelLocation;
    String[] touristLocation = new String[5];

    void addTouristLocation(String location1) {
        touristLocation[0]=location1;
    }
    void addTouristLocation(String location1,String location2) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
    }
    void addTouristLocation(String location1,String location2,String location3) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
    }
    void addTouristLocation(String location1,String location2,String location3,String location4) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
        touristLocation[3] = location4;
    }
    void addTouristLocation(String location1,String location2,String location3,String location4,String location5) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
        touristLocation[3] = location4;
        touristLocation[4] = location5;
    }
    //
    void removeTouristLocation(String location1){
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1))
                touristLocation[i] = null;
    }
    void removeTouristLocation(String location1,String location2){
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2))
                touristLocation[i] = null;
    }
    void removeTouristLocation(String location1,String location2,String location3){
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) ||
                    touristLocation[i].equals(location3))
                touristLocation[i] = null;
    }
    void removeTouristLocation(String location1,String location2,String location3,String location4){
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) ||
                    touristLocation[i].equals(location3) || touristLocation[i].equals(location4))
                touristLocation[i] = null;
    }

    void removeTouristLocation(String location1,String location2,String location3,String location4,String  location5){
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) ||
                    touristLocation[i].equals(location3) || touristLocation[i].equals(location4) ||
                    touristLocation[i].equals(location5))
                touristLocation[i] = null;
    }

    public TouristTicket(long pnrno, boolean confirmed, int price, String departureLocation, String destinationLocation,
                         Flight flight, Passenger details, String hotelLocation, String[] touristLocation) {
        super(pnrno, confirmed, price, departureLocation, destinationLocation, flight, details);
        this.hotelLocation = hotelLocation;
        this.touristLocation = touristLocation;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }
}
