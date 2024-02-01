package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.OperatorConstants;
import frc.robot.subsystems.NeoSubsystem;

public class TeleopCommand extends Command {
    private final NeoSubsystem neoSubsystem;
    private final CommandXboxController neoController;
    
    public TeleopCommand(NeoSubsystem subsystem, CommandXboxController controller) {
        neoSubsystem = subsystem;
        neoController = controller;

        addRequirements(neoSubsystem);
    }

    @Override
    public void execute() {
        double controllerValue = Math.signum(-neoController.getLeftY()) * Math.pow(neoController.getLeftY(), 2);

        controllerValue = MathUtil.applyDeadband(controllerValue, OperatorConstants.controllerDeadzone);

        neoSubsystem.setNeo(controllerValue);

    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("Set NEO speed to 0%");
        neoSubsystem.setNeo(0.0);
    }
  
    @Override
    public boolean isFinished() {
        return false;
    }

}
