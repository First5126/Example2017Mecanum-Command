package org.usfirst.frc.team5126.robot.subsystems;

import org.usfirst.frc.team5126.robot.RobotMap;
import org.usfirst.frc.team5126.robot.commands.SetCompressorAutoState;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticSystem extends Subsystem {

	private static Compressor compressorControl = RobotMap.compressorCtrl;
	private static Solenoid piston1 = RobotMap.pistor1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new SetCompressorAutoState());
    }
    
    public void extendPiston1(){
    	piston1.set(true);
    }
    public void retractPiston1(){
    	piston1.set(false);
    }
    public boolean getPiston(){
    	return piston1.get();
    }
    
    public void setCompressorAuto(){
    	compressorControl.setClosedLoopControl(true);
    }
    
}

