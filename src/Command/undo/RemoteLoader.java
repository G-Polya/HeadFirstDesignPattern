package Command.undo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,livingRoomLightOn,lightRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Command ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanMedium,ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
