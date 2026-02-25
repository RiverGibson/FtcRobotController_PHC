package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class OpMode_Travis extends OpMode {

    LilBlueBot_PHC blueBot = new LilBlueBot_PHC();

    @Override
    public void init() {blueBot.init(hardwareMap);
    }

    @Override
    public void loop() {blueBot.leftMotor.setPower(-0.5);
        blueBot.rightMotor.setPower(0.5);
    }
}