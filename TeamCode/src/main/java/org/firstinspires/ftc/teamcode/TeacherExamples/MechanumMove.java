package org.firstinspires.ftc.teamcode.TeacherExamples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="MechanumMove")
@Disabled
public class MechanumMove extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        DcMotor leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        DcMotor rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        DcMotor rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftRear.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightRear.setDirection(DcMotor.Direction.REVERSE);

        double Power = .4;

        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.a){
                Power = .7;
            }

            if (gamepad1.b){
                Power = .4;
            }


            if (gamepad1.dpad_up) {
                leftFront.setPower(Power);
                rightFront.setPower(Power);
                leftRear.setPower(Power);
                rightRear.setPower(Power);
            } else if (gamepad1.dpad_down) {
                leftFront.setPower(-Power);
                rightFront.setPower(-Power);
                leftRear.setPower(-Power);
                rightRear.setPower(-Power);
            } else if (gamepad1.dpad_right) {
                leftFront.setPower(Power);
                rightFront.setPower(-Power);
                leftRear.setPower(-Power);
                rightRear.setPower(Power);
            } else if (gamepad1.dpad_left) {
                leftFront.setPower(-Power);
                rightFront.setPower(Power);
                leftRear.setPower(Power);
                rightRear.setPower(-Power);
            } else {
                leftFront.setPower(Power);
                rightFront.setPower(Power);
                leftRear.setPower(Power);
                rightRear.setPower(Power);
            }
        }
    }
}
