package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "test")
<<<<<<<< HEAD:TeamCode/src/main/java/org/firstinspires/ftc/teamcode/samplarrie.java
public class smaplem extends LinearOpMode {
========
public class sample1K extends LinearOpMode {
>>>>>>>> 4b20c2db9c6546ffcfcf6c8e5621b18ff0afcd11:TeamCode/src/main/java/org/firstinspires/ftc/teamcode/sample1K.java

    @Override
    public void runOpMode() {

        double number =15;

        number = number +1;
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("Number", number);
            telemetry.addData("It's my birthday", number);
            telemetry.update();
        }




    }
}
