package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NeoSubsystem extends SubsystemBase {
    private final CANSparkMax neo;

    public NeoSubsystem() {
        neo = new CANSparkMax(1, MotorType.kBrushless);
    }

    public void setNeo(double speed) {
        neo.set(speed);
    }

    @Override
    public void periodic() {
    }

    @Override
    public void simulationPeriodic() {
    }
}
