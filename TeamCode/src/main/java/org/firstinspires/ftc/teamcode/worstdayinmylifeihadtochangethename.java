package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class worstdayinmylifeihadtochangethename extends OpMode {

    LilBlueBot_PHC bluebot = new LilBlueBot_PHC();

    @Override
    public void init() {
        bluebot.init(hardwareMap);
    }

    @Override
    public void loop() {
        bluebot.LeftMotor.setTargetPosition(0);
        bluebot.RightMotor.setTargetPosition(0);



    }
}
