package org.firstinspires.ftc.teamcode;

import static java.lang.String.valueOf;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp
public class TouchDrive extends LinearOpMode {

    public DcMotor fl = null;

    public DcMotor bl = null;

    public DcMotor fr = null;

    public DcMotor br = null;

    public Servo RightFeeder = null;

    public Servo LeftFeeder = null;

    public DcMotor IntakeMotor = null;

    public void runOpMode() {

        fl = hardwareMap.get(DcMotor.class, "left_front_drive");
        bl = hardwareMap.get(DcMotor.class, "left_back_drive");
        fr = hardwareMap.get(DcMotor.class, "right_front_drive");
        br = hardwareMap.get(DcMotor.class, "right_back_drive");


        /*IntakeMotor = hardwareMap.get(DcMotor.class, "intake");
        RightFeeder = hardwareMap.get(Servo.class, "right_intake_servo");
        LeftFeeder = hardwareMap.get(Servo.class, "left_intake_servo");*/

        fl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        br.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        fl.setDirection(DcMotor.Direction.FORWARD);
        bl.setDirection(DcMotor.Direction.FORWARD);
        fr.setDirection(DcMotor.Direction.FORWARD);
        br.setDirection(DcMotor.Direction.REVERSE);

        //LeftFeeder.setDirection(Servo.Direction.REVERSE);

        //double driveMode = 0;

        waitForStart();

        while (opModeIsActive()) {










            double power = -gamepad1.touchpad_finger_1_y;
            double powerst = gamepad1.touchpad_finger_1_x;
            double turn = -gamepad1.touchpad_finger_2_x;


            /*double flPower = 0;
            double frPower = 0;
            double blPower = 0;
            double brPower = 0;

            if (gamepad1.dpad_up) {
                driveMode = 0;
            }

            if (gamepad1.dpad_down) {
                driveMode = 1;
            }

            if (gamepad1.dpad_right) {
                driveMode = 2;
            }

            if (gamepad1.dpad_left) {
                driveMode = 3;
            }



            if (driveMode == 0) {

                fl.setDirection(DcMotor.Direction.FORWARD);
                bl.setDirection(DcMotor.Direction.FORWARD);
                fr.setDirection(DcMotor.Direction.FORWARD);
                br.setDirection(DcMotor.Direction.REVERSE);

                flPower = power + powerst + turn;
                blPower = power - powerst + turn;
                frPower = power - powerst - turn;
                brPower = power + powerst - turn;

            }

            if (driveMode == 1) {

                fl.setDirection(DcMotor.Direction.REVERSE);
                bl.setDirection(DcMotor.Direction.REVERSE);
                fr.setDirection(DcMotor.Direction.REVERSE);
                br.setDirection(DcMotor.Direction.FORWARD);

                flPower = power + powerst - turn;
                blPower = power - powerst - turn;
                frPower = power - powerst + turn;
                brPower = power + powerst + turn;

            }

            if (driveMode == 2) {

                fl.setDirection(DcMotor.Direction.REVERSE);
                bl.setDirection(DcMotor.Direction.FORWARD);
                fr.setDirection(DcMotor.Direction.FORWARD);
                br.setDirection(DcMotor.Direction.FORWARD);

                flPower = -power + powerst - turn;
                blPower = -power - powerst + turn;
                frPower = -power - powerst - turn;
                brPower = -power + powerst + turn;


            }

            if (driveMode == 3) {

                fl.setDirection(DcMotor.Direction.FORWARD);
                bl.setDirection(DcMotor.Direction.REVERSE);
                fr.setDirection(DcMotor.Direction.REVERSE);
                br.setDirection(DcMotor.Direction.REVERSE);

                flPower = -power + powerst + turn;
                blPower = -power - powerst - turn;
                frPower = -power - powerst + turn;
                brPower = -power + powerst - turn;

            }*/




            fl.setDirection(DcMotor.Direction.FORWARD);
            bl.setDirection(DcMotor.Direction.FORWARD);
            fr.setDirection(DcMotor.Direction.FORWARD);
            br.setDirection(DcMotor.Direction.REVERSE);





            while (gamepad1.touchpadWasPressed()) {

                double slow = 1.2 + -(gamepad1.right_trigger);

                power = -gamepad1.touchpad_finger_1_y;
                powerst = gamepad1.touchpad_finger_1_x;
                turn = -gamepad1.touchpad_finger_2_x;

                double flPower = power + powerst + turn;
                double blPower = power - powerst + turn;
                double frPower = power - powerst - turn;
                double brPower = power + powerst - turn;

                telemetry.addData("turn", turn);
                telemetry.addData("strafe", powerst);
                telemetry.addData("forward", power);

                fl.setPower(flPower * slow);
            bl.setPower(blPower * slow);
            fr.setPower(frPower * slow);
            br.setPower(brPower * slow);
}
           /* if (gamepad1.a) {
                IntakeMotor.setPower(1);

            } else {
                IntakeMotor.setPower(0);
            }

            if (gamepad1.bWasPressed()) {
                RightFeeder.setPosition(1);
                LeftFeeder.setPosition(1);
            }


            if (gamepad1.bWasReleased()) {
                RightFeeder.setPosition(0);
                LeftFeeder.setPosition(0);
            }

            telemetry.addData("Right Trigger", gamepad1.right_trigger);
            telemetry.addData("Left Trigger", gamepad1.left_trigger);
            telemetry.update();*/




        }
    }

}






