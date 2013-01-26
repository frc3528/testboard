/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.commands;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 *
 * @author jousley
 */
public class Listener extends CommandBase {
    
    private DriverStationLCD lcd;
    
    public Listener() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(shooter);
        lcd = DriverStationLCD.getInstance();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        printShooterOutputCurrency();
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    private void printShooterOutputCurrency() {
        /*
        double current = 0.0;
        
        try {
            current = shooter.getOutputCurrent();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        
        printLCD("Shooter current: " + current, DriverStationLCD.Line.kUser2);
        */
    }
    
    
    private void printLCD(String s) {
        clearLCD();
        lcd.println(DriverStationLCD.Line.kUser1, 1, s);
        lcd.updateLCD();
    }
    
    private void printLCD(String s, DriverStationLCD.Line line)
    {
        lcd.println(line, 1, s);
    }
    
    private void clearLCD() {
        lcd.println(DriverStationLCD.Line.kUser1, 1, "                              ");
        lcd.updateLCD();
    }
}
