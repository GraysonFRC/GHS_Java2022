// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.VictorSP;

public class Shooter extends SubsystemBase {
  private final VictorSP shooter_motor = new VictorSP(18);
  /** Creates a new Shooter. */
  public Shooter() {}

  @Override
  public void periodic() {

  //shooter_motor.set(bA);
    // This method will be called once per scheduler run
  }
}