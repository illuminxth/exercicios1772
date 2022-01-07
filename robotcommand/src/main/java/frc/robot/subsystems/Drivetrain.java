package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final VictorSP motorLeftOne, motorLeftTwo;
  private final VictorSP motorRightOne, motorRightTwo;
  private final SpeedControllerGroup groupLeft, groupRight;
  private final DifferentialDrive drive;

  public Drivetrain() {
    this.motorLeftOne = new VictorSP(0);
    this.motorLeftTwo = new VictorSP(1);
    this.motorRightOne = new VictorSP(2);
    this.motorRightTwo = new VictorSP(3);

    this.groupLeft = new SpeedControllerGroup(motorLeftOne, motorLeftTwo);
    this.groupRight = new SpeedControllerGroup(motorRightOne, motorRightTwo);

    this.drive = new DifferentialDrive(groupLeft, groupRight);
  }

  public void arcadeDrive(double foward, double rotation) {
    this.drive.arcadeDrive(foward, rotation);
  }

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {
  }
}
