/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author jousley
 */
public class Feeder extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    
   private Solenoid feederPush;
   private Solenoid feederPull;
   
   public Feeder() {
       feederPush = new Solenoid(1);
       feederPull = new Solenoid(2);
   }
   
   public void push() {
       feederPush.set(true);
   }
   
   
   public void pull() {
       feederPull.set(true);
   }
   
   
   public void reset() {
       feederPush.set(false);
       feederPull.set(false);
   }
   

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
