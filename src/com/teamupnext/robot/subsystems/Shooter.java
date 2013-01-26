/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.DriverStationLCD.Line;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.teamupnext.robot.RobotMap;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 *
 * @author jousley
 */
public class Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //private SpeedController shootingMotor;
    private Jaguar shootingMotor;
    private DriverStationLCD lcd;
    private double power = 0;

    public Shooter() throws CANTimeoutException {
        super();
        //shootingMotor = new Jaguar(RobotMap.SHOOTER_CHANNEL);
        //shootingMotor = new CANJaguar(RobotMap.SHOOTING_MOTOR_CAN_NUMBER);
        shootingMotor = new Jaguar(RobotMap.SHOOTER_CHANNEL);
        //talon.setSafetyEnabled(true);
        lcd = DriverStationLCD.getInstance();
        
        printLCD("STOPPED");
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public void increasePower() throws CANTimeoutException {
        //double power = talon.get();
        if (power < 1.0) {
            power += .1;
            power = roundstrip(power);
        }

        System.out.println("Power set to " + power);
        printLCD("" + power);
        shootingMotor.set(power);
    }

    public void decreasePower() throws CANTimeoutException {
        //double power = talon.get();
        if (power > -1.0) {
            power -= .1;
            power = roundstrip(power);
        }

        System.out.println("Power set to " + power);
        printLCD("" + power);
        shootingMotor.set(power);
    }

    public void stop() throws CANTimeoutException {
        power = 0;
        System.out.println("Power set to " + power);
        printLCD("STOPPED");
        shootingMotor.set(power);
    }
    
    //public double getOutputCurrent() throws CANTimeoutException
    //{
    //    return shootingMotor.getOutputCurrent();
    //}
    
    private void printLCD(String s) {
        clearLCD();
        lcd.println(Line.kUser1, 1, s);
        lcd.updateLCD();
    }
    
    private void printLCD(String s, Line line)
    {
        lcd.println(line, 1, s);
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
