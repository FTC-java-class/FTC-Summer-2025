package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@Autonomous(name = "Autonomous")
public class Auto extends LinearOpMode {

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





        }
    }

