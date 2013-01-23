package com.teamupnext.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //Joystick Constants
    public static final int JOYSTICK_PORT = 1;
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int JOYSTICK_BUTTON_1 = 1;
    public static final int JOYSTICK_BUTTON_2 = 2;
    public static final int JOYSTICK_BUTTON_3 = 3;
    public static final int JOYSTICK_BUTTON_4 = 4;
    public static final int JOYSTICK_BUTTON_5 = 5;
    public static final int JOYSTICK_BUTTON_6 = 6;
    //End Joystick Constants
    
    
    //Shooter Constants
    public static final int ShooterChannel = 7;
    //End Shooter Constants
    
    
    //Begin Feeder Constants
    public static final int FEEDER_PUSH_TIMEOUT = 3;
    public static final int FEEDER_PULL_TIMEOUT = 3;
    //End Feeder Constants
}
