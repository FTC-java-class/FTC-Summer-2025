package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Sample1 extends LinearOpMode {

    @Override
    public void runOpMode() {

        double number =100;

        number = number +100;

        while(opModeIsActive()){
            telemetry.addData("Number", number);
            telemetry.update();
        }




    }
}
