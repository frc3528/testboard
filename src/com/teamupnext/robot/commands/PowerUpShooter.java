/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.commands;

import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 *
 * @author jousley
 */
public class PowerUpShooter extends CommandBase {
    
    public PowerUpShooter() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        try {
            shooter.increasePower();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        //System.out.println("... power up end ...");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        //System.out.println("...powerup shooter interrupted...");
    }
}
