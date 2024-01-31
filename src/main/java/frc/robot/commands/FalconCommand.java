package frc.robot.commands;

import frc.robot.subsystems.FalconSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class FalconCommand extends Command {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    private final FalconSubsystem binarySubsystem;

    public FalconCommand(FalconSubsystem subsystem) {
        binarySubsystem = subsystem;

        addRequirements(subsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        System.out.println("Falcon sspeed set to 30%");

        binarySubsystem.setFalcon(0.3);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Falcon speed set to 0%");

        binarySubsystem.setFalcon(0.0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
