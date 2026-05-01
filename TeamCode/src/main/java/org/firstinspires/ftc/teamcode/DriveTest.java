package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.Servo;


@Autonomous(name="DriveTest", group="Autonomous")
public class DriveTest extends LinearOpMode {

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

            LEFTMOTOR.setPower(-1);
            RIGHTMOTOR.setPower(1);
            sleep(200);
            LEFTMOTOR.setPower(0);
            RIGHTMOTOR.setPower(0);

            
            break;
        }
    }
}