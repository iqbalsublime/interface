/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.data;

/**
 *
 * @author diu
 */
public class Panguin extends Bird {

    public Panguin() {
        super("Panguin");
    }

    @Override
    public void sound() {
        System.out.println("Sayekat.... Sayekat.....");
    }
  
      @Override
    public String toString() {
        return super.toString()+ "I have unusefull wings";
    }
    
}
