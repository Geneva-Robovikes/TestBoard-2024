package frc.robot.commands;

import frc.robot.subsystems.BinarySubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class BinaryCommand extends Command {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    private final BinarySubsystem binarySubsystem;
    private final CommandXboxController xboxController;

    public BinaryCommand(BinarySubsystem subsystem, CommandXboxController controller) {
        binarySubsystem = subsystem;
        xboxController = controller;

        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        if(xboxController.rightTrigger().getAsBoolean()) {
            System.out.println("Gyro resetted.");

            binarySubsystem.resetGyro();
        }

        binarySubsystem.setFalcon(0.3);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Falcon set to 0.0 volts.");

        binarySubsystem.setFalcon(0.0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
