package frc.robot.constants;

import org.frcteam3539.BulldogLibrary.INIConfiguration.BBConstants;

public class ShooterConstants extends BBConstants {
public ShooterConstants() {
	super("/home/lvuser/ShooterConstants.ini", true);
	save();
}

public static double revRps = 0.0;
public static double shootRps = 0.0;
public static double elevatorRps = 0.0;
public static double angleShooterP = 0.0;
public static double angleShooterI = 0.0;
public static double angleShooterD = 0.0;
public static double angleShooterV = 0.0;
public static double angleShooterG = 0.0;
public static int angleShooterSoftMin = 0;
public static int angleShooterSoftMax = 0;
public static double elevatorMotorP = 0.0;
public static double elevatorMotorI = 0.0;
public static double elevatorMotorD = 0.0;
public static double elevatorMotorV = 0.0;
public static double elevatorMotorG = 0.0;
public static int elevatorSoftMin = 0;
public static int elevatorSoftMax = 0;
public static double angleMotorToEncoder = 94.5; // Gear ratio between motor and piviot shaft
public static double elevatorMotorToInches = 0.1598888; // ins. per revolution
public static double shooterAngleOffset = 0.0;
public static double minElevatorMoveAngle = 0.0;
}