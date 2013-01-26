/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.subsystems;

import com.teamupnext.robot.RobotMap;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author jousley
 */
public class TestBox extends Subsystem {
    
    private Relay spike = new Relay(RobotMap.TEST_RELAY_CHANNEL);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void testRelayForward() {
        //spike.setDirection(Relay.Direction.kForward);
        spike.set(Relay.Value.kForward);
    }
    
    public void testRrelayReverse() {
        //spike.setDirection(Relay.Direction.kReverse);
        spike.set(Relay.Value.kReverse);
    }
    
    
}
