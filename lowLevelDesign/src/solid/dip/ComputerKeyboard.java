package solid.dip;

public class ComputerKeyboard {

    static class Computer {
        private InputDevice inputDevice;

        public Computer(InputDevice inputDevice) {
            this.inputDevice = inputDevice;
        }

        public void type() {
            System.out.println(inputDevice.getInput());
        }
    }




    interface InputDevice {
        String getInput();
    }

    static class Keyboard implements InputDevice {

        @Override
        public String getInput() {
            return "User is typing via wired keyboard";
        }
    }

    public static void main(String[] args) {
        InputDevice inputDevice = new Keyboard();
        Computer computer = new Computer(inputDevice);
        computer.type();
    }
}

