package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NeoSubsystem;

public class NeoCommand extends Command {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })

    private final NeoSubsystem neoSubsystem;

    public NeoCommand(NeoSubsystem subsystem) {
        neoSubsystem = subsystem;

        addRequirements(subsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        System.out.println("Neo speed set to 30%");

        neoSubsystem.setNeo(0.3);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Neo speed set to 0%");

        neoSubsystem.setNeo(0.0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
