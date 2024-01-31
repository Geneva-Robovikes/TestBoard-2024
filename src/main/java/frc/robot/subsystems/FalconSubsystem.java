package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.ADIS16448_IMU;

public class FalconSubsystem extends SubsystemBase {
    TalonFX falcon;

    ADIS16448_IMU gyro = new ADIS16448_IMU();

    public FalconSubsystem() {
        falcon = new TalonFX(0);
    }

    public void setFalcon(double speed) { //public void setFalcon
        falcon.set(speed);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
