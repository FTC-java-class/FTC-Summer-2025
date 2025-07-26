package org.firstinspires.ftc.teamcode;

import android.os.PowerManager;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp(name = "Sample2")
public class Sample2 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor leftRear = hardwareMap.get(DcMotor.class, "motorport0");
        DcMotor rightRear = hardwareMap.get(DcMotor.class, "motorport1");
        DcMotor rightFront = hardwareMap.get(DcMotor.class, "motorport2");
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "motorport3");

        Servo servo1 = hardwareMap.get(Servo.class, "servo1");

        telemetry.addData(">", "Press Start to scan Servo." );
        telemetry.update();
        waitForStart();

        IMU imu = hardwareMap.get(IMU.class, "imu");

        ImuOrientationOnRobot orientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.FORWARD,
                RevHubOrientationOnRobot.UsbFacingDirection.UP);

        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

        telemetry.addData( "Status", "IMU Calibrating...");
        telemetry.update();

        // You don't HAVE to do this, but it makes things clear
        leftRear.setDirection(DcMotor.Direction.FORWARD);
        rightRear.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        leftFront.setDirection(DcMotor.Direction.FORWARD);


        waitForStart();

        while (opModeIsActive()) {
             float LRPower = (gamepad1.left_stick_y);
            float RRPower = (gamepad1.left_stick_y);
            float RFPower = (gamepad1.left_stick_y);
            float LFPower = (gamepad1.left_stick_y);

            float SLRPower = (gamepad1.left_stick_x);
            float SRRPower = (gamepad1.left_stick_x);
            float SRFPower = (gamepad1.left_stick_x);
            float SLFPower = (gamepad1.left_stick_x);

            float TPower = (gamepad1.right_stick_x);

            if(gamepad1.a) {
                servo1.setPosition(1);
            }
            else {
                servo1.setPosition(0);
            }



            double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

            telemetry.addData( "Heading (Z)", heading);
            telemetry.update();




            leftRear.setPower(-LRPower + SLRPower - TPower);
            rightRear.setPower(RRPower + SRRPower - TPower);
            rightFront.setPower(-RFPower - SRFPower - TPower);
            leftFront.setPower(LFPower - SLFPower - TPower);

        }
    }
}
