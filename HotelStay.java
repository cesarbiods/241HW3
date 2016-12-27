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
public abstract class HotelStay {
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    
    public HotelStay(LocalDate a, LocalDate d) {
        arrivalDate = a;
        departureDate = d;
    }
    
    //calculate the number of days and get price
    public int betweenDates() {
        return Period.between(arrivalDate, departureDate).getDays();
    }
    
    public abstract double getPrice();
}
