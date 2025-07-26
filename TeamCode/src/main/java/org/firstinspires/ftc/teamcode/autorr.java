package org.firstinspires.ftc.teamcode;
<<<<<<< HEAD

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;

@Autonomous(name = "Auto")
public class autorr extends LinearOpMode {

    public void runOpMode() throws InterruptedException {
        DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        DcMotor rearRight = hardwareMap.get(DcMotor.class, "rearRight");
        DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        DcMotor rearLeft = hardwareMap.get(DcMotor.class, "rearLeft");
        IMU imu = hardwareMap.get(IMU.class, "imu")
        // You don't HAVE to do this, but it makes things clear
        frontRight.setDirection(DcMotor.Direction.FORWARD);
        rearRight.setDirection(DcMotor.Direction.FORWARD);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        rearLeft.setDirection(DcMotor.Direction.FORWARD);

        double Power = 0.5;

    waitForStart();

    backrightDrive.setPower(0.3);


        waitForStart();


    }
}
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

        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

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
