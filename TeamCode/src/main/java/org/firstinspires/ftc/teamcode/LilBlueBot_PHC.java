package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LilBlueBot_PHC {
   public DcMotor leftMotor = null;
    public DcMotor rightMotor = null;

    public void init(HardwareMap hwMap) {
        leftMotor = hwMap.dcMotor.get("leftMotor");
        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightMotor = hwMap.dcMotor.get("rightMotor");
    }

    public void tankDrive(double LeftStickyY, double RightStickY) {
        leftMotor.setPower(LeftStickyY);
        rightMotor.setPower(RightStickY);
    }
}
