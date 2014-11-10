/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit;

import info.diit.data.AFSnake;
import info.diit.data.Bird;
import info.diit.data.Crow;
import info.diit.service.Flyable;

/**
 *
 * @author diu
 */
public class TestInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bird b;
        Flyable f;
        Crow c= new Crow();
        AFSnake as=new AFSnake();
        System.out.println(c);
        //System.out.println(as);
        b=c;
        f=c; 
        c.fly();
        f=as;
        as.fly();
        
        
    }
}
