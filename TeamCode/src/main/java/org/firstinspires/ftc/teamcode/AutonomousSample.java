package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp(name = "Autonomous")
public class AutonomousSample extends LinearOpMode {

    ElapsedTime et = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor BRmotor = hardwareMap.get(DcMotor.class, "motorport0");
        DcMotor BLmotor = hardwareMap.get(DcMotor.class, "motorport1");
        DcMotor FRmotor = hardwareMap.get(DcMotor.class, "motorport2");
        DcMotor FLmotor = hardwareMap.get(DcMotor.class, "motorport3");
        Servo servo1 = hardwareMap.get(Servo.class, "servo1");

        IMU imu = hardwareMap.get(IMU.class, "imu");

        ImuOrientationOnRobot orientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.FORWARD,
                RevHubOrientationOnRobot.UsbFacingDirection.UP);
        IMU.Parameters parameters = new IMU.Parameters(orientation);
        imu.initialize(parameters);

        telemetry.addData("Status", "IMU Calibration...");
        telemetry.update();


        // You don't HAVE to do this, but it makes things clear
        BRmotor.setDirection(DcMotor.Direction.FORWARD);
        BLmotor.setDirection(DcMotor.Direction.FORWARD);
        FRmotor.setDirection(DcMotor.Direction.FORWARD);
        FLmotor.setDirection(DcMotor.Direction.FORWARD);

imu.resetYaw();

        waitForStart();
        double correction = 0;

        et.reset();
        while (opModeIsActive() && et.milliseconds() < 10200) {
            double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

            telemetry.addData("Heading (Z)", heading);
            telemetry.update();
            if(heading > 0.005) {
                correction = 0.2;
            }

        }

        BRmotor.setPower(0.3 + correction);
        BLmotor.setPower(-0.3 + correction);
        FLmotor.setPower(-0.3 + correction);
        FRmotor.setPower(0.3 + correction);

        sleep(9500);

        BRmotor.setPower(0.3);
        BLmotor.setPower(0.3);
        FRmotor.setPower(0.3);
        FLmotor.setPower(0.3);

        sleep(1500);
        imu.resetYaw();

        BRmotor.setPower(0.3 + correction);
        BLmotor.setPower(-0.3 + correction);
        FLmotor.setPower(-0.3 + correction);
        FRmotor.setPower(0.3 + correction);

        sleep(9000);

        BRmotor.setPower(-0.3 + correction);
        BLmotor.setPower(0.3 + correction);
        FLmotor.setPower(0.3 + correction);
        FRmotor.setPower(-0.3 + correction);

        sleep(9000);

        BRmotor.setPower(-0.3);
        BLmotor.setPower(-0.3);
        FRmotor.setPower(-0.3);
        FLmotor.setPower(-0.3);

        sleep(1500);
        imu.resetYaw();

        BRmotor.setPower(-0.3 + correction);
        BLmotor.setPower(0.3 + correction);
        FLmotor.setPower(0.3 + correction);
        FRmotor.setPower(-0.3 + correction);

        sleep(9500);





        while (opModeIsActive()) {
            float FLPower = (gamepad1.left_stick_y);
            float FRPower = (gamepad1.left_stick_y);
            float BLPower = (gamepad1.left_stick_y);
            float BRPower = (gamepad1.left_stick_y);

            float FLXP = (gamepad1.left_stick_x);
            float FRXP = (gamepad1.left_stick_x);
            float BLXP = (gamepad1.left_stick_x);
            float BRXP = (gamepad1.left_stick_x);

            float T = (gamepad1.right_stick_x);





            double heading = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.DEGREES);

            telemetry.addData("Heading (Z)", heading);
            telemetry.update();










// imu measures orientation (tracks direction) yaw is direction bot facing imu.getRobotYawPitchROllAngles().getYam(AngleUnit.DEGREES);

            BRmotor.setPower(-FLPower + FLXP - T);
            BLmotor.setPower(BLPower + BLXP - T);
            FRmotor.setPower(-FRPower - FRXP - T);
            FLmotor.setPower(BRPower - BRXP - T);

        }
    }
}
