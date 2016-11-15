package com.example.entities;

import javax.persistence.*;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "ID")
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nOfNights;

    public HotelBooking(){}

    public HotelBooking(String hotelName, double pricePerNight, int nOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nOfNights = nOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getnOfNights() {
        return nOfNights;
    }

    public long getId(){
        return id;
    }

    public double getTotalPrice(){
        return pricePerNight * nOfNights;
    }
}
