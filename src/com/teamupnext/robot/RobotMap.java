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
    
    //Compressor Constants
    public static final int PRESSURE_SWITCH_DIO_CHANNEL = 1;
    public static final int COMPRESSOR_RELAY_CHANNEL = 1;
    //End Compressor Constants
    
    //Shooter Constants
    public static final int SHOOTER_CHANNEL = 7;
    public static final int SHOOTING_MOTOR_CAN_NUMBER = 6;
    //End Shooter Constants
    
    
    //Begin Feeder Constants
    public static final double FEEDER_PUSH_TIMEOUT = .25;
    public static final double FEEDER_PULL_TIMEOUT = .25;
    public static final int FEEDER_PUSH_SOLENOID_CHANNEL = 3;
    public static final int FEEDER_PULL_SOLENOID_CHANNEL = 4;
    //End Feeder Constants
    
    //testbox constants
    public static final int TEST_RELAY_CHANNEL = 8;
    //end testbox constants
}
