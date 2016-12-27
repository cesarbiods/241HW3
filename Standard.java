/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw03;

import java.time.LocalDate;

/**
 *
 * @author Cesar
 */
public class Standard extends HotelStay {

    public Standard(LocalDate a, LocalDate d) {
        super(a, d);
    }

    private double price = 250;

    public double getPrice() {
        return price * this.betweenDates();
    }
}
