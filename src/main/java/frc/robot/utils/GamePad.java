package frc.robot.utils;
import edu.wpi.first.wpilibj.Joystick;

public class GamePad
{
    public static enum Axes {
        LEFT_X(0),
        LEFT_Y(1),
        LEFT_TRIGGER(2),
        RIGHT_TRIGGER(3),
        RIGHT_X(4),
        RIGHT_Y(5),
        D_PAD_HORIZONTAL(6),
        D_PAD_VERTICAL(7);

        private final int number;
        Axes(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    /**
     * Enumeration for the various buttons
     */
    public static enum Buttons {
        A(1),
        B(2),
        X(3),
        Y(4),
        LEFT_BUMPER(5),
        RIGHT_BUMPER(6),
        BACK(7),
        START(8),
        LEFT_STICK(9),
        RIGHT_STICK(10);

        private final int number;
        Buttons(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
// Following code doesn't work like most everything I do
  /* public GamePad(int port){
        super();
    }

    public double getRAwAxis(Axes axis){
        return super.getRawAxis(axis.getNumber());
    }*/
}