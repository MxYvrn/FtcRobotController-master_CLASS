package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Daphne", group="TeleOp")
public class CodeFrame extends LinearOpMode {

    // hardware declerations
    DcMotor LEFTMOTOR;
    DcMotor RIGHTMOTOR;
    DcMotor INTAKEMOTOR;
    DcMotor SHOOTERMOTOR;
    Servo SERVO;
    
    // toggle state tracking
    boolean shooterOn = false;
    boolean previousA = false;


    @Override
    public void runOpMode() {
        
        // hardware init
        LEFTMOTOR = hardwareMap.get(DcMotor.class, "MotorLeft");
        RIGHTMOTOR = hardwareMap.get(DcMotor.class, "MotorRight");
        INTAKEMOTOR = hardwareMap.get(DcMotor.class, "IntakeMotor");
        SHOOTERMOTOR = hardwareMap.get(DcMotor.class, "ShooterMotor");
        SERVO = hardwareMap.get(Servo.class, "Servo");
        
        waitForStart();

        // code goes here
        while (opModeIsActive()) {
            // Shooter toggle on A button
            if (gamepad1.a && !previousA) {
                shooterOn = !shooterOn; // toggle state
            }
            previousA = gamepad1.a;
            
            // Set shooter motor power based on toggle state
            if (shooterOn) {
                SHOOTERMOTOR.setPower(1.0); // full power when on
            } else {
                SHOOTERMOTOR.setPower(0.0); // off
            }
            
            // Telemetry to show shooter status
            telemetry.addData("Shooter ON", shooterOn);
            telemetry.update();
        }
    }
}