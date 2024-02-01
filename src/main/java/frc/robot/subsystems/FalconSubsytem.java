package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;

public class FalconSubsytem extends SubsystemBase {
    TalonFX falcon;
    DigitalInput limitSwitch;

    public FalconSubsytem() {
        falcon = new TalonFX(3);

        limitSwitch = new DigitalInput(9);
    }

    public void setFalcon(double speed) {
        falcon.set(speed);
    }

    public boolean getLimitSwitchState() {
        return limitSwitch.get();
    }


    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
