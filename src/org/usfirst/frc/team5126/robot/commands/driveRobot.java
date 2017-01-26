package org.usfirst.frc.team5126.robot.commands;

import org.usfirst.frc.team5126.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveRobot extends Command {

    public driveRobot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.subRobotDriveSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	/* 
    	 * Lets show off the use of smart dashboard 
    	 * 
    	 * We will right up something in the subsystem.
    	 */
    	Robot.subRobotDriveSystem.writeStatusDriveUptoDashboard();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//We are calling upon the subsystem to drive the robot.. 
    	/*
    	 * In the method called the x, y, z coordinates of the plane are 
    	 * read from the joystick and placed to the Robot Drive Object.
    	 * 
    	 */
    	Robot.subRobotDriveSystem.driveRobot();
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
}
