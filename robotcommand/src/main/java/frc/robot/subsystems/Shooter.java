package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  private final TalonSRX motorLeft;
  private final TalonSRX motorRight;

  public Shooter() {
    this.motorLeft = new TalonSRX(0);
    this.motorRight = new TalonSRX(1);
  }

  public void shootBall(double velocity) {
    this.motorLeft.set(ControlMode.PercentOutput, velocity);
    this.motorRight.set(ControlMode.PercentOutput, velocity);
  }

  public void reverseBall(double velocity) {
    this.motorLeft.set(ControlMode.PercentOutput, velocity);
    this.motorRight.set(ControlMode.PercentOutput, velocity);
  }

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {
  }
}
