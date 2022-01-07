package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDrive extends CommandBase {
  private final Drivetrain drivetrain;
  private double foward;
  private double rotation;

  public ArcadeDrive(Drivetrain drivetrain, double foward, double rotation) {
    this.drivetrain = drivetrain;
    this.foward = foward;
    this.rotation = rotation;

    addRequirements(drivetrain);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.drivetrain.arcadeDrive(foward, rotation);
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
