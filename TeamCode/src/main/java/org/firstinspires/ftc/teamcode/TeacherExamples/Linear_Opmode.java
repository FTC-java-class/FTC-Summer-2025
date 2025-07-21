package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class Linear_Opmode extends LinearOpMode {

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
