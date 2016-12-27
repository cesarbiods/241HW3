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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hey = "hello";
        String yes = "there";
        String airline = "no";
        Adult steve = new Adult(hey, yes);
        Luxury marriot = new Luxury(LocalDate.now(), LocalDate.now().minusDays(3));
        FirstClass delta = new FirstClass(airline, LocalDate.now(), LocalDate.now().minusDays(3));
        VacationPackage blah = new VacationPackage(LocalDate.now(), LocalDate.now().minusDays(3));
        System.out.println(blah.getGuest());
    }
    
}
