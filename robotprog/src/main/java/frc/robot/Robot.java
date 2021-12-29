package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {

  VictorSP motorLeft, motorLeft2;
  VictorSP motorRight, motorRight2;
  SpeedControllerGroup left, right;
  DifferentialDrive drive;
  XboxController joystick;
  SpeedControllerGroup shooter;
  AHRS navX;

  @Override
  public void robotInit() {
    motorLeft = new VictorSP(0);
    motorLeft2 = new VictorSP(1);
    motorRight = new VictorSP(2);
    motorRight2 = new VictorSP(3);

    left = new SpeedControllerGroup(motorLeft, motorLeft2);
    right = new SpeedControllerGroup(motorRight, motorRight2);

    drive = new DifferentialDrive(left, right);

    navX = new AHRS(SPI.Port.kMXP);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    if (navX.getAngle() < 45)
      drive.arcadeDrive(0, 0.4);
    else
      drive.stopMotor();
  }

  @Override
  public void teleopInit() {
    joystick = new XboxController(0);
  }

  @Override
  public void teleopPeriodic() {
    drive.arcadeDrive(joystick.getY(Hand.kLeft), joystick.getX(Hand.kRight));
    if (joystick.getAButton())
      shooter.set(0.8);
    else if (joystick.getBButton())
      shooter.set(-0.8);
    else
      shooter.set(0);
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }
}
