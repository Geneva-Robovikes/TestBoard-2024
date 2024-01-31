package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.ADIS16448_IMU;
import edu.wpi.first.wpilibj.DigitalInput;

public class FalconSubsytem extends SubsystemBase {
    TalonFX falcon;
    DigitalInput limitSwitch;


    ADIS16448_IMU gyro = new ADIS16448_IMU();

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

    public void resetGyro() {
        gyro.reset();
    }

    @Override
    public void periodic() {

    }

    @Override
    public void simulationPeriodic() {

    }
}
