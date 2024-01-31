package frc.robot.commands;

import frc.robot.subsystems.FalconSubsytem;
import edu.wpi.first.wpilibj2.command.Command;

public class FalconCommand extends Command {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    private final FalconSubsytem falconSubsytem;

    public FalconCommand(FalconSubsytem subsystem) {
        falconSubsytem = subsystem;

        addRequirements(subsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        System.out.println("Falcon speed set to 30%");

        falconSubsytem.setFalcon(0.3);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Falcon speed set to 0%");

        falconSubsytem.setFalcon(0.0);
    }

    @Override
    public boolean isFinished() {
        return falconSubsytem.getLimitSwitchState();
    }
}
