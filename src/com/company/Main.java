package com.company;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Passenger passenger1 = new Passenger("thomas churuch ","tirunelveli","tamil nadu",
                "+91 1234567890","xyz@gmail.com","Carol");
        Flight flight1 = new Flight("Rocket","Air India",250,65,"15/oct/2021",
                "16/oct/2021","15:00:00","18:00:00");
        RegularTicket rt = new RegularTicket(88889976676L,true,5000,"tamil nadu",
                "chennai",flight1,passenger1,"Mineral Water","Biriyani","pasta");
        String[] touristlocation = {"dharavi","chennai","maldivs","Goa","india gate"};
        TouristTicket tt = new TouristTicket(89898908577L, true,7000,"Tamil Nadu",
                "Hong Kong",flight1,passenger1,"Taj Hotel",touristlocation);

        System.out.println(flight1.getflightDetails());
        System.out.println(rt.getdurationofjourney());
    }
}

