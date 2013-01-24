
package com.teamupnext.robot;

import com.teamupnext.robot.commands.Feed;
import com.teamupnext.robot.commands.PowerDownShooter;
import com.teamupnext.robot.commands.PowerUpShooter;
import com.teamupnext.robot.commands.TestRelayForward;
import com.teamupnext.robot.commands.TurnOffShooter;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    private Joystick joystick;
    private JoystickButton increaseShooterPower;
    private JoystickButton decreaseShooterPower;
    private JoystickButton stopShooter;
    
    private JoystickButton feed;
    private JoystickButton testRelayForward;
    
    public OI()
    {
        joystick = new Joystick(RobotMap.JOYSTICK_PORT);
        
        
        //shooter 
        increaseShooterPower = new JoystickButton(joystick, RobotMap.RIGHT_BUMPER);
        decreaseShooterPower = new JoystickButton(joystick, RobotMap.LEFT_BUMPER);
        stopShooter = new JoystickButton(joystick, RobotMap.X_BUTTON);
        
        increaseShooterPower.whenPressed(new PowerUpShooter());
        decreaseShooterPower.whenPressed(new PowerDownShooter());
        stopShooter.whenPressed(new TurnOffShooter());        
        
        
        
        //feeder
        feed = new JoystickButton(joystick, RobotMap.A_BUTTON);
        feed.whenPressed(new Feed());
        
        
        //test relay
        testRelayForward = new JoystickButton(joystick, RobotMap.Y_BUTTON);
        testRelayForward.whenPressed(new TestRelayForward());
        
        
        System.out.println("===========> made it 1");
        
    }
    
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

