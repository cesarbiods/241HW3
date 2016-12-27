/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw03;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Cesar
 */
public class VacationPackage {
    
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Guest bob;
    private HotelStay hotel;
    private AirTravel flight;
    
    public VacationPackage(LocalDate a, LocalDate d) {
        arrivalDate = a;
        departureDate = d;
    }
    
    public Guest getGuest() {
        return bob;
    }
    
    public void setGuest(Guest g) {
        bob = g;
    }
    
    public HotelStay getHotelStay() {
        return hotel;
    }
    
    public void setHotelStay(HotelStay h) {
        hotel = h;
    }
    
    public AirTravel getAirTravel() {
        return flight;
    }
    
    public void setAirTravel(AirTravel a) {
        flight = a;
    }
    
    public int getLengthOfStay() {
        Period betweenDates = Period.between(arrivalDate, departureDate);
        return betweenDates.getDays();
    }
    
    public double getPrice() {
        //check for null values
        double totalPrice = 0;
        
        
        if (hotel != null) {
//            double hotelPrice =  hotel.getPrice();
            totalPrice += hotel.getPrice();
        }
        
        if (flight != null) {
//            double flightPrice = flight.getPrice();
            totalPrice += flight.getPrice();
        }
        
        if (bob instanceof Adult) {
            double adultPrice = 100 * this.getLengthOfStay();
            totalPrice += adultPrice;
        } else {
            double childPrice = 25 * this.getLengthOfStay();
            totalPrice += childPrice;
        }
        return totalPrice;
    }
}
