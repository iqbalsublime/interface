/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.data;

import info.diit.service.Flyable;

/**
 *
 * @author diu
 */
public class Crow extends Bird implements Flyable {

    public Crow() {
        super("Crow");
    }

    
    @Override
    public void sound() {
        System.out.println("Ka.....ka......");
    }

    @Override
    public void fly() {
        System.out.println("I can fly ");
    }

    @Override
    public String toString() {
        return super.toString()+ "I have " +wings + "wings";
    }
    
    
}
