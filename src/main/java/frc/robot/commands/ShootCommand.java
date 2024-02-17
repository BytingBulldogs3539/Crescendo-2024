// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;

public class ShootCommand extends Command {
/** Creates a new ShootCommand. */
public ShootCommand() {
	// Use addRequirements() here to declare subsystem dependencies.
}

// Called when the command is initially scheduled.
@Override
public void initialize() {
	// RobotContainer.shooterSubsystem.setFeedMotorSpeed(ShooterConstants.shootRps);
}

// Called every time the scheduler runs while the command is scheduled.
@Override
public void execute() {
	RobotContainer.shooterSubsystem.setFeedMotorVoltage(12);
	RobotContainer.intakeSubsystem.setGrabMotorVoltage(12);
}

// Called once the command ends or is interrupted.
@Override
public void end(boolean interrupted) {
	// RobotContainer.shooterSubsystem.setFeedMotorSpeed(0);
	RobotContainer.shooterSubsystem.setFeedMotorVoltage(0);
	RobotContainer.intakeSubsystem.setGrabMotorVoltage(0);
}

// Returns true when the command should end.
@Override
public boolean isFinished() {
	return false;
}
}
