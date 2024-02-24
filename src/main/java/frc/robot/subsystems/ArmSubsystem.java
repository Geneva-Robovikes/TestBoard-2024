// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
  TalonFX falcon;
  TalonFX falcon2;
  TalonFX falcon4;
  /** Creates a new ArmSubsystem. */
  public ArmSubsystem() {
    falcon = new TalonFX(1);
    falcon2 = new TalonFX(2);
    falcon4 = new TalonFX(3);
  }

  public void setspeed(double speed) {
    falcon.set(speed);
    falcon2.set(speed);
    falcon4.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
