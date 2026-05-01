package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="CodeFrame", group="TeleOp")
public class CodeFrame extends LinearOpMode {

    // hardware declerations
    DcMotor LEFTMOTOR;
    DcMotor RIGHTMOTOR;
    DcMotor INTAKEMOTOR;
    DcMotor SHOOTERMOTOR;
    Servo SERVO;


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
            
            break;
        }
    }
}