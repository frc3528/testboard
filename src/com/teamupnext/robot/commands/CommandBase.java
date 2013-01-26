package com.teamupnext.robot.commands;

import com.teamupnext.robot.OI;
import com.teamupnext.robot.RobotMap;
import com.teamupnext.robot.subsystems.Feeder;
import com.teamupnext.robot.subsystems.Shooter;
import com.teamupnext.robot.subsystems.TestBox;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Command;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command{

    public static OI oi;
    // Create a single static instance of all of your subsystems
    //public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    /**
     *
     */
    private static Compressor compressor = new Compressor(RobotMap.PRESSURE_SWITCH_DIO_CHANNEL, RobotMap.COMPRESSOR_RELAY_CHANNEL);
    public static Shooter shooter;
    public static Feeder feeder = new Feeder();
    public static TestBox testbox = new TestBox();

    public static void init() throws CANTimeoutException {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        compressor.start();
        
        shooter = new Shooter();
        
        oi = new OI();
        
        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
