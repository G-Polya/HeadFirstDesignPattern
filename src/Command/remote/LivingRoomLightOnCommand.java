package Command.remote;

public class LivingRoomLightOnCommand implements Command{
    Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
