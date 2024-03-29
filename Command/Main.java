package Command;

// Command interface
interface Command {
    void execute();
}

// Receiver
class Light {
    void turnOn() {
        System.out.println("Light is on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

// Concrete command
class TurnOnCommand implements Command {
    private final Light light;

    TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

// Concrete command
class TurnOffCommand implements Command {
    private final Light light;

    TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Invoker
class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        // Turning on the light
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        // Turning off the light
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }
}

