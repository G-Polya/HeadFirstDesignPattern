package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        DvdPlayer dvd = new DvdPlayer("DVD player",amp);
        CdPlayer cd = new CdPlayer("CD player", amp);
        Projector projector = new Projector("Projecter", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();

    }
}
