package frc.robot.commands;

import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ReverseBall extends CommandBase {
  private final Shooter shooter;
  private double velocity;

  public ReverseBall(Shooter shooter, double velocity) {
    this.shooter = shooter;
    this.velocity = velocity;

    addRequirements(shooter);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    this.shooter.reverseBall(velocity);
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
