package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp
public class worstdayinmylifeihadtochangethename extends OpMode {


    LilBlueBot_PHC bluebot = new LilBlueBot_PHC();

    TBDGamepad gamepad;

    @Override
    public void init() {
        bluebot.init(hardwareMap);
    }
    gamepad =  new TBDGamepad(gamepad1);

    @Override
    public void loop() {
        gamepad.update();
        bluebot.leftMotor.setPower(gamepad.getLeftY());
        bluebot.rightMotor.setPower(gamepad.getLeftY());



    }
}
