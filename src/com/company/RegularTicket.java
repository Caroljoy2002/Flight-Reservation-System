package com.company;

public class RegularTicket extends Ticket {
    private String water;
    private String food;
    private String snacks;

    String getspecialservice(){
        return water+", "+food+", "+snacks;
    }
    void updateSpecialService(String water,String food,String snacks){
        this.food = food;
        this.water = water;
        this.snacks = snacks;
    }

    public RegularTicket(long pnrno, boolean confirmed, int price, String departureLocation, String destinationLocation,
                         Flight flight, Passenger details, String water, String food, String snacks) {
        super(pnrno, confirmed, price, departureLocation, destinationLocation, flight, details);
        this.water = water;
        this.food = food;
        this.snacks = snacks;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
}

