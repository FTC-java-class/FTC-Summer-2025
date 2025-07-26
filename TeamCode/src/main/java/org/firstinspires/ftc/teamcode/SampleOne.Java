package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class SampleOne extends LinearOpMode {

    @Override
    public void runOpMode() {

        double number =100;

        number = number +100;
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("Number", number);
            telemetry.update();
        }




    }
}