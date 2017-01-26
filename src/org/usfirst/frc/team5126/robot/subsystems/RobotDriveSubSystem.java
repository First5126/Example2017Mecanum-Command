package org.usfirst.frc.team5126.robot.subsystems;

import org.usfirst.frc.team5126.robot.Robot;
import org.usfirst.frc.team5126.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RobotDriveSubSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Joystick stick0 = Robot.oi.getStick0();
	private Victor frontLeft = RobotMap.frontLeft;
	private Victor frontRight = RobotMap.frontRight;
	private Victor rearLeft = RobotMap.rearLeft;
	private Victor rearRight = RobotMap.rearRight;
	
	private RobotDrive rd = RobotMap.rd;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	/*
    	 * Placing the default command to call upon the 
    	 * In the subsystem to start the teleop drive system. 
    	 */
    	setDefaultCommand(new org.usfirst.frc.team5126.robot.commands.driveRobot());
    }
    
    public void driveRobot(){
    	rd.mecanumDrive_Cartesian(stick0.getX(), stick0.getY(), stick0.getZ(), 0);
    }
    public void writeStatusDriveUptoDashboard(){
    	SmartDashboard.putString("Drive Train", "Ready");
    }
}

