package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LilBlueBot_PHC {
   public DcMotor LeftMotor;

    {
        LeftMotor = null;
    }
   public DcMotor RightMotor;

    {
        RightMotor = null;
    }

    public void init(HardwareMap hwMap) {
        LeftMotor = hwMap.dcMotor.get("leftMotor");
        RightMotor = hwMap.dcMotor.get("rightMotor");

    }
}