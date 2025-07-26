package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "OneMotor")
public class OneMotor extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        DcMotor rearRight = hardwareMap.get(DcMotor.class, "rearRight");
        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        DcMotor rearLeft = hardwareMap.get(DcMotor.class, "rearLeft");

        // You don't HAVE to do this, but it makes things clear
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        rearRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        rearLeft.setDirection(DcMotor.Direction.FORWARD);

        double Power = 0.5;

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a){
                Power = .8;
                { if else (gamepad1.b) }
                else{
                }
                Power = 0;
            }
            if (gamepad1.b){
                Power = .5;
            }
            Power = 0;

            frontRight.setPower(Power);
            rearRight.setPower(Power);
            frontLeft.setPower(Power);
            rearLeft.setPower(Power);
        }
    }
}
