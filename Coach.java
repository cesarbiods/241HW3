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
public class Coach extends AirTravel {

    public Coach(String a, LocalDate d, LocalDate r) {
        super(a, d, r);
    }

    private double price = 300;

    public double getPrice() {
        return price;
    }
}
