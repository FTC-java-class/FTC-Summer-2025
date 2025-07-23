package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "OneMotor")
@Disabled
public class OneMotor extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "leftFront");

        // You don't HAVE to do this, but it makes things clear
        leftFront.setDirection(DcMotor.Direction.FORWARD);

        double Power = 0.5;

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a){
                Power = .8;
            }
            if (gamepad1.b){
                Power = .5;
            }

            leftFront.setPower(Power);
        }
    }
}
