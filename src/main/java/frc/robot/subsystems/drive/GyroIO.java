package frc.robot.subsystems.drive;

import org.littletonrobotics.junction.AutoLog;

/** Generic Gyro IO */
public interface GyroIO {

  @AutoLog
  public static class GyroIOInputs {
    public boolean connected = false;
    public double yawPosition = 0.0;
    public double yawVelocityRadPerSec =
        0.0; // TODO: We dont acutlaly use this anywhere, might aswell just axe it.
  }

  public default void updateInputs(GyroIOInputs inputs) {}
}
