package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;

@TeleOp(name="TeleOP", group="TeleOp")
public class TeleOP extends LinearOpMode {

    // hardware declerations
    DcMotor LEFTMOTOR;
    DcMotor RIGHTMOTOR;
    DcMotor INTAKEMOTOR;
    DcMotor SHOOTERMOTOR;
    CRServo SERVO;


    @Override
    public void runOpMode() {

        // hardware init
        LEFTMOTOR = hardwareMap.get(DcMotor.class, "MotorLeft");
        RIGHTMOTOR = hardwareMap.get(DcMotor.class, "MotorRight");
        INTAKEMOTOR = hardwareMap.get(DcMotor.class, "IntakeMotor");
        SHOOTERMOTOR = hardwareMap.get(DcMotor.class, "ShooterMotor");
        SERVO = hardwareMap.get(CRServo.class, "Servo");

        SHOOTERMOTOR.setPower(0.5);

        waitForStart();

        // code goes here
        while (opModeIsActive()) {

            // arcade drive: y = forward/back, x = turn
            double drive = -gamepad1.left_stick_y;
            double turn  =  gamepad1.left_stick_x;
            LEFTMOTOR.setPower(drive + turn);
            RIGHTMOTOR.setPower(-(drive - turn));

            if (gamepad1.right_bumper) {
                SHOOTERMOTOR.setPower(0);
                INTAKEMOTOR.setPower(0);
            }
            else if (gamepad1.left_trigger > 0.5) {
                SHOOTERMOTOR.setPower(1);
            }
            else if (gamepad1.right_trigger > 0.5) {
                INTAKEMOTOR.setPower(1);
            }

        }
    }
}
