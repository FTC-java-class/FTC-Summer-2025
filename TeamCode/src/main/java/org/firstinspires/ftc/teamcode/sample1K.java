package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "test")
public class sample1K extends LinearOpMode {

    @Override
    public void runOpMode() {

        double number =15;

        number = number +1;
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("Number", number);
            telemetry.addData("It's my birthday", number);
            telemetry.update();
        }




    }
}
