package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CargoUtil;

public class OperateCargo extends CommandBase{
    private CargoUtil cargoUtil;

    /**Creates a new OperateCargo*/
    public OperateCargo(CargoUtil du){
        // Use addRequirements() here to declare subsystem dependencies.
        this.cargoUtil = du;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        cargoUtil.StopBallMagent();
        cargoUtil.StopIndexer();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

}
