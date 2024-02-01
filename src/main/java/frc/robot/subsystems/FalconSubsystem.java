package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.ADIS16448_IMU;

public class FalconSubsystem extends SubsystemBase {
    TalonFX falcon;
    TalonFX falcon2;

    ADIS16448_IMU gyro = new ADIS16448_IMU();

    public FalconSubsystem() {
        falcon = new TalonFX(3);
        falcon2 = new TalonFX(4);
    }

    public void setFalcon(double speed) { //public void setFalcon
        falcon.set(speed);
        falcon2.set(speed);
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
