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
public class AFSnake extends Snake implements Flyable{

  
    @Override
    public void fly(){
    System.out.println("I can fly");
}

    @Override
    public String toString() {
        return "Snake";
    }
      
}
