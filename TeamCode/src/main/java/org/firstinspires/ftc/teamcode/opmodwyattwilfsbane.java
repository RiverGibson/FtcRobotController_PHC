package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class opmodwyattwilfsbane extends OpMode {

    LilBlueBot_PHC blueBot = new LilBlueBot_PHC();
TBDGamepad gamepad = new TBDGamepad(gamepad1);

    @Override
    public void init() {
        blueBot.init(hardwareMap);
    }
    
    @Override
    public void loop() {
        gamepad. update();

        blueBot.leftMotor.setPower(gamepad.getLeftY());

        blueBot.rightMotor.setPower(gamepad.getLeftY());
    }
}