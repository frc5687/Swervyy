package frc.robot.utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Motor;
import frc.robot.commands.TrunRight;

public class OI {
    Joystick leftJoy = new Joystick(0);
    JoystickButton button1 = new JoystickButton(leftJoy, 1), button2 = new JoystickButton(leftJoy, 2),
            button3 = new JoystickButton(leftJoy, 3), button4 = new JoystickButton(leftJoy, 4);

    // 8 buttons
    public OI() {
        button1.whenPressed((Command) new Motor(1, 10, 20));
    }
}    