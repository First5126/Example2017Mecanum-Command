package org.usfirst.frc.team5126.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static Victor frontLeft = new Victor(0);
	public static Victor frontRight = new Victor(1);
	public static Victor rearLeft = new Victor(2);
	public static Victor rearRight = new Victor(3);
	
	public static RobotDrive rd = new RobotDrive(frontLeft,frontRight,rearLeft,rearRight);
	
	public static CANTalon t1 = new CANTalon(0);
	
	public static Compressor compressorCtrl = new Compressor();
	public static Solenoid pistor1 = new Solenoid(0,0);
	
			
}
