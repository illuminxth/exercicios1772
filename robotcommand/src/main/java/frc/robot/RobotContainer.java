package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.ReverseBall;
import frc.robot.commands.ShootBall;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // subsystems
  private Drivetrain drivetrain;
  private Shooter shooter;

  // xbox
  private XboxController joystick;

  public RobotContainer() {
    this.drivetrain = new Drivetrain();
    this.shooter = new Shooter();
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    this.drivetrain.setDefaultCommand(
        new ArcadeDrive(
            drivetrain,
            this.joystick.getY(Hand.kLeft),
            this.joystick.getX(Hand.kRight)));

    var buttonA = new JoystickButton(this.joystick, Button.kA.value);
    var buttonB = new JoystickButton(this.joystick, Button.kB.value);

    buttonA.whenPressed(new ShootBall(shooter, Constants.fowardVelocity));
    buttonB.whenPressed(new ReverseBall(shooter, Constants.backwardVelocity));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
