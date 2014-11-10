/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.data;

/**
 *
 * @author diu
 */
public abstract class Bird {
  
  private String groupName;

  public abstract void sound();

    public Bird() {
    
    }

    public Bird(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Bird{" + "groupName=" + groupName + '}';
    }
  
}
