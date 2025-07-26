package org.firstinspires.ftc.teamcode;
<<<<<<< HEAD

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@Autonomous(name = "Autonomous")
public class AutoBot extends LinearOpMode {

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
=======
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@Autonomous(name = "Auto")
public class Auto extends LinearOpMode{
    public void runOpMode() throws InterruptedException {
        DcMotor frontleft = hardwareMap.get(DcMotor.class, "frontleft");
        DcMotor frontright = hardwareMap.get(DcMotor.class, "frontright");
        DcMotor backleft = hardwareMap.get(DcMotor.class, "backleft");
        DcMotor backright = hardwareMap.get(DcMotor.class, "backright");
        ColorSensor color = hardwareMap.get(ColorSensor.class, "color");
        IMU imu = hardwareMap.get(IMU.class, "imu");

        // You don't HAVE to do this, but it makes things clear
        frontleft.setDirection(DcMotor.Direction.FORWARD);
        frontright.setDirection(DcMotor.Direction.REVERSE);
        backleft.setDirection(DcMotor.Direction.FORWARD);
        backright.setDirection(DcMotor.Direction.REVERSE);

        ImuOrientationOnRobot orientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.BACKWARD,
                RevHubOrientationOnRobot.UsbFacingDirection.LEFT);
>>>>>>> 4b20c2db9c6546ffcfcf6c8e5621b18ff0afcd11

        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

<<<<<<< HEAD
        telemetry.addData( "Status", "IMU Calibrating...");
        telemetry.update();

        // You don't HAVE to do this, but it makes things clear
        leftRear.setDirection(DcMotor.Direction.FORWARD);
        rightRear.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.FORWARD);
        leftFront.setDirection(DcMotor.Direction.FORWARD);


        waitForStart();

        leftRear.setPower(-0.3);
        rightRear.setPower(0.3);
        rightFront.setPower(-0.3);
        leftFront.setPower(0.3);

        sleep(10200);

        leftRear.setPower(0.3);
        rightRear.setPower(-0.3);
        rightFront.setPower(0.3);
        leftFront.setPower(-0.3);

        sleep(1500);

        leftRear.setPower(-0.3);
        rightRear.setPower(0.3);
        rightFront.setPower(-0.3);
        leftFront.setPower(0.3);

        sleep( 10200);

        leftRear.setPower(0.3);
        rightRear.setPower(-0.3);
        rightFront.setPower(0.3);
        leftFront.setPower(-0.3);

        sleep( 3000);

        leftRear.setPower(-0.3);
        rightRear.setPower(0.3);
        rightFront.setPower(-0.3);
        leftFront.setPower(0.3);

        sleep(10200);

        leftRear.setPower(0.3);
        rightRear.setPower(-0.3);
        rightFront.setPower(0.3);
        leftFront.setPower(-0.3);

        sleep( 4500);

        leftRear.setPower(-0.3);
        rightRear.setPower(0.3);
        rightFront.setPower(-0.3);
        leftFront.setPower(0.3);

        sleep( 10200);



            if(gamepad1.a) {
                double Servo = 0.5;
            }

            servo1.setPosition(0.5);



            double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

            telemetry.addData( "Heading (Z)", heading);
            telemetry.update();
=======
        telemetry.addData("Status", "IMU Calibrating...");
        telemetry.update();

        imu.resetYaw();
        waitForStart();

        double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

        telemetry.addData("Heading (Z)", heading);
        telemetry.update();

        frontleft.setPower(0.3);
        frontright.setPower(0.3);
        backleft.setPower(0.3);
        backright.setPower(0.3);

        sleep(2000);

        while ()
        frontleft.setPower(-0.3);
        frontright.setPower(0.3);
        backleft.setPower(-0.3);
        backright.setPower(0.3);

        sleep(2000);

        frontleft.setPower(0);
        frontright.setPower(0);
        backleft.setPower(0);
        backright.setPower(0);
>>>>>>> 4b20c2db9c6546ffcfcf6c8e5621b18ff0afcd11





<<<<<<< HEAD
        }
    }

=======

        double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

        telemetry.addData("Heading (Z)", heading);
        telemetry.update();

/*            frontleft.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x);
            frontright.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x);
            backleft.setPower(gamepad1.left_stick_y - gamepad1.left_stick_x);
            backright.setPower(gamepad1.left_stick_y + gamepad1.left_stick_x);

            frontleft.setPower(gamepad1.right_stick_y - gamepad1.right_stick_x);
            frontright.setPower(gamepad1.right_stick_y + gamepad1.right_stick_x);
            backleft.setPower(gamepad1.right_stick_y - gamepad1.right_stick_x);
            backright.setPower(gamepad1.right_stick_y + gamepad1.right_stick_x);*/
    }
}
>>>>>>> 4b20c2db9c6546ffcfcf6c8e5621b18ff0afcd11
