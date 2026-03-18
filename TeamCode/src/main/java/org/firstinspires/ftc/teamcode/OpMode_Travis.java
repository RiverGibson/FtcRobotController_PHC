package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class OpMode_Travis extends OpMode {

    LilBlueBot_PHC blueBot = new LilBlueBot_PHC();
    TBDGamepad gamepad;

    @Override
    public void init() {blueBot.init(hardwareMap);
        gamepad = new TBDGamepad(gamepad1);
    }

    @Override
    public void loop() {
        gamepad.update();

        blueBot.tankDrive(gamepad.getLeftY(), gamepad.getRightY());
    }
}