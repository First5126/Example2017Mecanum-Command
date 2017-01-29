package org.usfirst.frc.team5126.robot.subsystems;

import org.usfirst.frc.team5126.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TalonTest extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private CANTalon t1 = RobotMap.t1;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void controlTalon(double in){
    	t1.set(in);
    }
}

