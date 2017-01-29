package org.usfirst.frc.team5126.robot.commands;

import org.usfirst.frc.team5126.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendRetractPiston1 extends Command {
	private boolean isFinished = false;
    public ExtendRetractPiston1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.pneumaticControl);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.pneumaticControl.getPiston()){
    		Robot.pneumaticControl.retractPiston1();
    	}
    	else {
    		Robot.pneumaticControl.extendPiston1();
    	}
    	
    	isFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
