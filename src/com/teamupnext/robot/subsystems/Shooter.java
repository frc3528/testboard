/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.DriverStationLCD.Line;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.teamupnext.robot.RobotMap;

/**
 *
 * @author jousley
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Talon talon;
    private DriverStationLCD lcd;
    private double power = 0;

    public Shooter() {
        super();
        talon = new Talon(RobotMap.ShooterChannel);
        //talon.setSafetyEnabled(true);
        lcd = DriverStationLCD.getInstance();
        
        printLCD("STOPPED");
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void increasePower() {
        //double power = talon.get();
        if (power < 1.0) {
            power += .1;
            power = roundstrip(power);
        }

        System.out.println("Power set to " + power);
        printLCD("" + power);
        talon.set(power);
    }

    public void decreasePower() {
        //double power = talon.get();
        if (power > -1.0) {
            power -= .1;
            power = roundstrip(power);
        }

        System.out.println("Power set to " + power);
        printLCD("" + power);
        talon.set(power);
    }

    public void stop() {
        power = 0;
        System.out.println("Power set to " + power);
        printLCD("STOPPED");
        talon.set(power);
    }
    
    private void printLCD(String s) {
        clearLCD();
        lcd.println(Line.kUser1, 1, s);
        lcd.updateLCD();
    }
    
    private void clearLCD() {
        lcd.println(Line.kUser1, 1, "                              ");
        lcd.updateLCD();
    }
    
    private double roundstrip(double myNum) {
        
        int precision = 10; //keep 1 digit
        myNum = Math.floor(myNum * precision + .5) / precision;
        return myNum;        
    }
    
}
