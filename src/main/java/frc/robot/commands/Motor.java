package frc.robot.commands;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;

public class Motor {
    public Motor(int direction,int speed, int distance){
        switch(direction){
            case(1):
            MoveForward();
            break;
            case(2):
            TurnLeft();
            break;
            case(3):
            TurnRight();
            break;
            case(4):
            MoveBack();
            break;
        }
    }

    public static void MotorSetup(){
        Spark spark = new Spark(0);
        spark.set(0.75);
        VictorSP victor = new VictorSP(0);
        victor.set(0.6);
    }

    public static void MoveForward(){

    }

    public static void TurnLeft(){

    }

    public static void TurnRight(){

    }

    public static void MoveBack(){

    }
}
