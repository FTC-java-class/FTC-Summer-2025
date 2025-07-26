package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;


import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@Autonomous(name = "AutoCaden")

public class AutoCaden extends LinearOpMode {

    @Override

    public void runOpMode() throws InterruptedException {
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        DcMotor rearRight = hardwareMap.get(DcMotor.class, "rearRight");
        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        DcMotor rearLeft = hardwareMap.get(DcMotor.class, "rearLeft");
        IMU imu = hardwareMap.get(IMU.class, "imu");
        // You don't HAVE to do this, but it makes things clear
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        rearRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        rearLeft.setDirection(DcMotor.Direction.REVERSE);
        ImuOrientationOnRobot orientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.LEFT,
                RevHubOrientationOnRobot.UsbFacingDirection.UP);

        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

        double Power = 0.5;

        imu.resetYaw();
        waitForStart();
        telemetry.addData("Status", "IMU Calibration...");
        telemetry.update();
        rearRight.setPower(-0.3);
        rearLeft.setPower(-0.3);
        frontRight.setPower(-0.3);
        frontLeft.setPower(-0.3);

        sleep(4000);

        while (imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES) < -90) {
            telemetry.addData("Status", "IMU Calibration...");
            telemetry.update();
            rearRight.setPower(-0.7);
            rearLeft.setPower(0.7);
            frontRight.setPower(-0.7);
            frontLeft.setPower(0.7);
        }


       /* while (opModeIsActive()) {
            double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);
            Power = gamepad1.left_stick_x * -0.7;

            telemetry.addData("Heading (2)", heading);
            telemetry.update();

            if (gamepad1.a) {
                frontRight.setPower(gamepad1.left_stick_y);
                rearRight.setPower(gamepad1.left_stick_y);
                frontLeft.setPower(gamepad1.left_stick_y);
                rearLeft.setPower(gamepad1.left_stick_y);
            } else {
                frontRight.setPower(gamepad1.left_stick_y * 0.7 + -Power - gamepad1.right_stick_y);
                rearRight.setPower(gamepad1.left_stick_y * 0.7 + Power - gamepad1.right_stick_y);
                frontLeft.setPower(gamepad1.left_stick_y * 0.7 + Power + gamepad1.right_stick_y);
                rearLeft.setPower(gamepad1.left_stick_y * 0.7 + -Power + gamepad1.right_stick_y);
            }
        }*/
    }
}