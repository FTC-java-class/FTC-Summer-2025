package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(name = "SampleOpMode")
@Disabled
public class opmode extends OpMode {
    double number = 100.0;

    @Override
    public void init() {
        number = number + 100;
    }

    @Override
    public void loop() {
        if (number < 300){
            number = number + 50;
        }
        else{
            number = number - 50;
        }
        telemetry.addData("Number", number);
    }
}
